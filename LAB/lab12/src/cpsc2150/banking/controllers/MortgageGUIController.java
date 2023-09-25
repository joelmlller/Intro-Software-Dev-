package cpsc2150.banking.controllers;
import cpsc2150.banking.models.Customer;
import cpsc2150.banking.models.ICustomer;
import cpsc2150.banking.models.IMortgage;
import cpsc2150.banking.models.Mortgage;
import cpsc2150.banking.views.*;

import static cpsc2150.banking.models.ICustomer.MAX_CREDIT_SCORE;

public class MortgageGUIController implements IMortgageController {
    // Class that holds the view object
    private final IMortgageView viewObject;

    // Constructor to initialize the view object
    public MortgageGUIController(IMortgageView v) {
        viewObject = v;
    }

    // Method to handle the mortgage application process
    public void submitApplication() {
        // Declare necessary variables
        String name;
        double yearlyIncome;
        double monthlyDebt;
        int creditScore;

        double houseCost;
        double downPayment;
        int years;



        // Input and validation for name
        name = viewObject.getName();
        if (name.length() == 0) {
            viewObject.printToUser("Name cannot be blank!");
            return;
        }

        // Input and validation for yearly income
        yearlyIncome = viewObject.getYearlyIncome();
        if (yearlyIncome < 0) {
            viewObject.printToUser("Income must be greater than 0.");
            return;
        }

        // Input and validation for monthly debt
        monthlyDebt = viewObject.getMonthlyDebt();
        if (monthlyDebt < 0) {
            viewObject.printToUser("Debt must be greater than or equal to 0.");
            return;
        }

        // Input and validation for credit score
        creditScore = viewObject.getCreditScore();
        if (creditScore < 0 || creditScore >= MAX_CREDIT_SCORE) {
            viewObject.printToUser("Credit Score must be greater than 0 and less than 850");
            return;
        }

        // Input and validation for house cost
        houseCost = viewObject.getHouseCost();
        if (houseCost <= 0) {
            viewObject.printToUser("Cost must be greater than 0.");
            return;
        }

        // Input and validation for down payment
        downPayment = viewObject.getDownPayment();
        if (downPayment <= 0 || downPayment >= houseCost) {
            viewObject.printToUser("Down Payment must be greater than 0 " +
                "and less than the cost of the house.");
           return;
        }

        // Input and validation for years
        years = viewObject.getYears();
        if (years <= 0) {
            viewObject.printToUser("Years must be greater than 0.");
            return;
        }

        // Create customer and mortgage objects with the provided data
        ICustomer customerInfo = new Customer(monthlyDebt, yearlyIncome, creditScore, name);
        IMortgage mortgageInfo = new Mortgage(houseCost, downPayment, years, customerInfo);


        if(mortgageInfo.loanApproved()){
            viewObject.printToUser("Provide Customer and Mortgage information");
            viewObject.displayApproved(mortgageInfo.loanApproved());
            viewObject.displayRate(mortgageInfo.getRate());
            viewObject.displayPayment(mortgageInfo.getPayment());
        }
        else{
            viewObject.printToUser("Provide Customer and Mortgage information");
            viewObject.displayApproved(mortgageInfo.loanApproved());
            viewObject.displayRate(0);
            viewObject.displayPayment(0);
        }
    }
}