 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * March 7, 2023
  */



 package cpsc2150.extendedConnectX;

import java.util.Scanner;
import cpsc2150.extendedConnectX.models.GameBoard;
import cpsc2150.extendedConnectX.models.IGameBoard;

public class GameScreen {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  boolean play = true;
  //start the game loop
  while (play) {
   // Create a new game board for each game
   IGameBoard bo = new GameBoard();

   // Set the player to 'X' at the start of each game
   char person = 'X';
   int COL = -1;
   boolean loop = true;

   while (loop) {
    // Clear the board at the start of each game
    for (int i = 0; i < bo.getNumRows(); i++) {
     for (int j = 0; j < bo.getNumColumns(); j++) {
      bo.placeToken(' ', j);
     }
    }
    // Print the game board to the console
    System.out.println(bo.toString());

    // Initialize the valid column variable to false at the start of each turn
    boolean VC = false;

    //loop until valid column
    while (!VC)
    {
     System.out.println("Player " + person + ", what column do you want to place your marker in?");
     COL = scanner.nextInt();

     // Check for invalid column input
     if (COL < 0)
     {
      System.out.println("Column cannot be less than 0");
     }
     else if (COL >= bo.getNumColumns())
     {
      System.out.println("Column cannot be greater than " + (bo.getNumColumns() - 1));
     }
     else if (!bo.checkIfFree(COL))
     {
      System.out.println("Column is full");
     }
     else {
      VC = true;
     }
    }

    bo.placeToken(person, COL);

    if (bo.checkForWin(COL))
    {
     System.out.println(bo.toString());
     System.out.println("Player " + person + " Won!");
     loop = false;
    }
    else if (bo.checkTie())
    {
     System.out.println(bo.toString());
     System.out.println("The game is a tie!");
     loop = false;
    }
    else
    {
     if (person == 'X')
     {
      person = 'O';
     }
     else
     {
      person = 'X';
     }
    }
   }
   System.out.println("Would you like to play again? Y/N");
   String input = scanner.next().toUpperCase();
   play = input.equals("Y");
  }
 }
}