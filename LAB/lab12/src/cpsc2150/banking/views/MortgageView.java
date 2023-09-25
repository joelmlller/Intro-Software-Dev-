/* * * * * * * * * * * * * * * * * *
 * Name:        Austin Wagner       *
 * Partner:     Joel Miller         *
 * Instructor:  Dr. Sun             *
 * CPSC 2151    Spring 23           *
 * Project:     Lab 11              *
 * * * * * * * * * * * * * * * * * */

package cpsc2150.banking.views;
import cpsc2150.banking.controllers.IMortgageController;

import java.util.Scanner;

public class MortgageView implements IMortgageView {

    // Initialize a Scanner object to receive input from the user
    private final Scanner input = new Scanner(System.in);

    // Declare a variable for an interface that controls the mortgage application process
    private  IMortgageController controller;

    // Default constructor
    public MortgageView() {
        // No initialization needed for the default constructor
    }

    // Set the controller to be used for the mortgage application process
    public void setController(IMortgageController c) {
        controller = c;
    }

    // Prompt the user for the cost of the house and return the input as a double
    public double getHouseCost() {
        System.out.println("How much does the house cost?");
        return Double.parseDouble(input.nextLine());
    }

    // Prompt the user for the amount of the down payment and return the input as a double
    public double getDownPayment() {
        System.out.println("How much is the down payment?");
        return Double.parseDouble(input.nextLine());
    }

    // Prompt the user for the number of years for the mortgage and return the input as an integer
    public int getYears() {
        System.out.println("How many years?");
        return Integer.parseInt(input.nextLine());
    }

    // Prompt the user for their monthly debt payments and return the input as a double
    public double getMonthlyDebt() {
        System.out.println("How much are your monthly debt payments?");
        return Double.parseDouble(input.nextLine());
    }

    // Prompt the user for their yearly income and return the input as a double
    public double getYearlyIncome() {
        System.out.println("How much is your yearly income?");
        return Double.parseDouble(input.nextLine());
    }

    // Prompt the user for their credit score and return the input as an integer
    public int getCreditScore() {
        System.out.println("What is your credit score?");
        return Integer.parseInt(input.nextLine());
    }

    // Prompt the user for their name and return the input as a string
    public String getName() {
        System.out.println("What's your name?");
        return input.nextLine();
    }

    // Print a message to the user
    public void printToUser(String s) {
        System.out.println(s);
    }

    // Display the monthly mortgage payment to the user
    public void displayPayment(double p) {
        System.out.println("Monthly Payment: $" + p);
    }

    // Display the interest rate to the user
    public void displayRate(double r) {
        System.out.println("Interest Rate: " + r + "%");
    }

    // Display whether the mortgage application is approved or not to the user
    public void displayApproved(boolean a) {
        System.out.println(a);
    }

    // Prompt the user if they want to apply for another mortgage and return the input as a boolean
    public boolean getAnotherMortgage() {
        final char YES_OPTION = 'Y';
        final char NO_OPTION = 'N';
        final String ERROR_MESSAGE = "Selection must be " + YES_OPTION + "/" + NO_OPTION;


        char userChar;
        do {
            System.out.println("Would you like to apply for another mortgage? Y/N");
            userChar = input.nextLine().trim().toUpperCase().charAt(0);
            switch (userChar) {
                case YES_OPTION:
                    return true;
                case NO_OPTION:
                    return false;
                default:
                    System.out.println(ERROR_MESSAGE);
            }
        } while (true);
    }

    // Prompt the user if they want to consider another customer and return the input as a boolean
    public boolean getAnotherCustomer() {
        char user;
        System.out.println("Would you like to consider another customer? Y/N");
        do {
            user = Character.toUpperCase(input.nextLine().charAt(0));
            if (user != 'Y' && user != 'N') {
                System.out.println("Selection must be Y/N");
            }
        } while (user != 'Y' && user != 'N');


        return (user == 'Y');
    }
}