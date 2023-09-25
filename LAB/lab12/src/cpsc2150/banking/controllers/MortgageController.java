/* * * * * * * * * * * * * * * * * *
 * Name:        Austin Wagner       *
 * Partner:     Joel Miller         *
 * Instructor:  Dr. Sun             *
 * CPSC 2151    Spring 23           *
 * Project:     Lab 11              *
 * * * * * * * * * * * * * * * * * */

package cpsc2150.banking.controllers;

//needed for using the Max_Credit_score constant
import static cpsc2150.banking.models.ICustomer.MAX_CREDIT_SCORE;

import cpsc2150.banking.models.Customer;
import cpsc2150.banking.models.ICustomer;

import cpsc2150.banking.models.IMortgage;
import cpsc2150.banking.models.Mortgage;
import cpsc2150.banking.views.IMortgageView;

public class MortgageController implements IMortgageController {

   // Class that holds the view object
   private final IMortgageView viewObject;

   // Constructor to initialize the view object
   public MortgageController(IMortgageView v) {
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

      // Loop for processing multiple customers
      do {

         // Input and validation for name
  do {
            name = viewObject.getName();
            if (name.length() == 0) {
               viewObject.printToUser("Name cannot be blank!");
            }
 } while (name.length() == 0);

         // Input and validation for yearly income
  do {
            yearlyIncome = viewObject.getYearlyIncome();
            if (yearlyIncome < 0) {
               viewObject.printToUser("Income must be greater than 0.");
            }
  } while (yearlyIncome < 0);

         // Input and validation for monthly debt
  do {
            monthlyDebt = viewObject.getMonthlyDebt();
            if (monthlyDebt < 0) {
               viewObject.printToUser("Debt must be greater than or equal to 0.");
            }
} while (monthlyDebt < 0);

         // Input and validation for credit score
 do {
            creditScore = viewObject.getCreditScore();
            if (creditScore < 0 || creditScore >= MAX_CREDIT_SCORE) {
               viewObject.printToUser("Credit Score must be greater than 0 and less than 850");
            }
 } while (creditScore <= 0 || creditScore >= MAX_CREDIT_SCORE);

         // Loop for processing multiple mortgages for the same customer
do {

            // Input and validation for house cost
 do {
               houseCost = viewObject.getHouseCost();
               if (houseCost <= 0) {
                  viewObject.printToUser("Cost must be greater than 0.");
               }
 } while (houseCost <= 0);

            // Input and validation for down payment
do {
               downPayment = viewObject.getDownPayment();
               if (downPayment <= 0 || downPayment >= houseCost) {
                  viewObject.printToUser("Down Payment must be greater than 0 " +
                          "and less than the cost of the house.");
               }
  } while (downPayment <= 0 || downPayment >= houseCost);

            // Input and validation for years
 do {
               years = viewObject.getYears();
               if (years <= 0) {
                  viewObject.printToUser("Years must be greater than 0.");
               }
} while (years <= 0);

            // Create customer and mortgage objects with the provided data
            ICustomer customerInfo = new Customer(monthlyDebt, yearlyIncome, creditScore, name);
            IMortgage mortgageInfo = new Mortgage(houseCost, downPayment, years, customerInfo);

            // Display customer and mortgage information
            viewObject.printToUser(customerInfo.toString());
            viewObject.printToUser(mortgageInfo.toString());
            // Continue if the customer wants another mortgage
 } while (viewObject.getAnotherMortgage());

         // Continue if there's another customer
      } while (viewObject.getAnotherCustomer());

   }
}