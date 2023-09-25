package cpsc2150.banking.models;
/* * * * * * * * * * * * * * * * * *
 * Name:        Austin Wagner       *
 * Partner:     Joel Miller         *
 * Instructor:  Dr. Sun             *
 * CPSC 2151    Spring 23           *
 * Project:     Lab 11              *
 * * * * * * * * * * * * * * * * * */

import cpsc2150.banking.models.AbsMortgage;
import cpsc2150.banking.models.ICustomer;
import cpsc2150.banking.models.IMortgage;


/**
 * @invariant costOfHome > 0 AND 0 <= downPayment < costOfHome AND IMortgage.MIN_YEARS <= years <= IMortgage.MAX_YEARS
 *
 *
 * @correspondence self.person.getName() = customer.getName()
 * AND self.person.getCreditScore() = customer.getCreditScore()
 * AND self.person.getIncome() = customer.getIncome() 
 * AND self.person.getMonthlyDebtPayments() = customer.getMonthlyDebtPayments()
 * AND self.costOfHome = homeCost AND self.downPayment = down
 * AND self.years = numYears
 * AND self.Loan = self.costOfHome - self.downPayment
 */

public class Mortgage extends AbsMortgage implements IMortgage {

    private final ICustomer person;
    private final double costOfHome;
    private final double downPayment;
    private final int years;

    /**
     * Constructs a new Mortgage object with the specified parameters.
     *
     * @param homeCost the cost of the house the customer wants to buy
     * @param down the down payment on the loan
     * @param numYears the number of years the customer will take to repay the loan
     * @param customer the customer who is taking out the mortgage
     *
     * @pre 0 <= down < homeCost AND homeCost > 0 AND IMortgage.MIN_YEARS <= numYears <= IMortgage.MAX_YEARS
     *
     * @post [applyForLoan iff the loan was approved with those terms] AND
     *       CreditScore = #CreditScore AND MonthlyDebt=
     *       #MonthlyDebt AND Loan = #Loan AND Income = #Income AND Name = #Name
     */
    public Mortgage(double homeCost, double down, int numYears, ICustomer customer) {
        person = customer;
        costOfHome = homeCost;
        downPayment = down;
        years = numYears;
    }

    public boolean loanApproved() {
        double debtToIncome = (getPayment() + person.getMonthlyDebtPayments()) / (person.getIncome()/MONTHS_IN_YEAR);

        if((getRate() >= RATETOOHIGH)||((downPayment/costOfHome) < MIN_PERCENT_DOWN) || (debtToIncome > DTOITOOHIGH)){
            return false;
        }
        else{
            return true;
        }
    }

    public double getPayment() {
        double monthlyRate = getRate() / MONTHS_IN_YEAR;
        int numMonths = years * MONTHS_IN_YEAR;

        return ((monthlyRate * getPrincipal()) / (1 - Math.pow(1 + monthlyRate, -numMonths)));
    }

    public double getRate() {
        // APR starts at 2.5%
        double myAPR = BASERATE;

        // If loan is for less than 30 years
        if (years < MAX_YEARS) {
            // Add 0.5% to APR
            myAPR = myAPR + GOODRATEADD;
        } else {
            // Else, add 1.0% to APR
            myAPR = myAPR + NORMALRATEADD;
        }

        // If the down payment is not at least 20%
        if ((downPayment / costOfHome) < PREFERRED_PERCENT_DOWN){
            // Add 0.5% to APR
            myAPR = myAPR + GOODRATEADD;
        }

        // If the customer's credit score is under 500
        if (person.getCreditScore() < BADCREDIT){
            // Add 10.0% to APR
            myAPR = myAPR + VERYBADRATEADD;
        }
        // Between 500 and 600
        else if(person.getCreditScore() < FAIRCREDIT){
            // Add 5.0% to APR
            myAPR = myAPR + BADRATEADD;
        }
        // Between 600 and 700
        else if(person.getCreditScore() < GOODCREDIT){
            // Add 1.0% to APR
            myAPR = myAPR + NORMALRATEADD;
        }
        // Between 700 and 750
        else if(person.getCreditScore() < GREATCREDIT){
            // Add 0.5% to APR
            myAPR = myAPR + GOODRATEADD;
        }
        // Else, between 750 AND 850, nothing added to APR
        return myAPR ;
    }

    public double getPrincipal() {
        return (costOfHome - downPayment);
    }

    public int getYears() {
        return years;
    }
}
