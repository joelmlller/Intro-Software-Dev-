 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * April 13, 2023
  */

 package cpsc2150.extendedConnectX;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;
 import cpsc2150.extendedConnectX.models.GameBoard;
 import cpsc2150.extendedConnectX.models.GameBoardMem;
 import cpsc2150.extendedConnectX.models.IGameBoard;

 public class GameScreen {

  public static void main(String[] args) {

   //Constants of the game. Change these if you would like to increase or decrease game settings.
   int MAX_PLAYERS = 10;
   int MIN_PLAYERS = 2;

   int MAX_ROWS = 100;
   int MIN_ROWS = 3;

   int MAX_COLUMNS = 100;
   int MIN_COLUMNS = 3;

   int MAX_TOKENS = 25;
   int MIN_TOKENS = 3;


   Scanner scanner = new Scanner(System.in);
   boolean game = true;

   while (game) {
    System.out.println("How many players?");
    int numPlayers = Integer.parseInt(scanner.nextLine());

    while (numPlayers > MAX_PLAYERS || numPlayers < MIN_PLAYERS) {
     if (numPlayers > MAX_PLAYERS) {
      System.out.println("Must be 10 players or fewer");
     } else if (numPlayers < MIN_PLAYERS) {
      System.out.println("Must be at least 2 players");
     }
     System.out.println("How many players?");
     numPlayers = Integer.parseInt(scanner.nextLine());
    }


    List<Character> players = new ArrayList<>();

    for (int i = 0; i < numPlayers; i++) {
     System.out.println("Enter the character to represent player " + (i + 1));
     char playerChar = scanner.nextLine().toUpperCase().charAt(0);
     while (players.contains(playerChar)) {
      System.out.println(playerChar + " is already taken as a player token! Enter a new character for Player " + (i + 1) + ":");
      playerChar = scanner.nextLine().toUpperCase().charAt(0);
     }
     players.add(playerChar);
    }


    System.out.println("How many rows should be on the board?");
    int rows = Integer.parseInt(scanner.nextLine());
    while (rows > MAX_ROWS || rows < MIN_ROWS) {
     if (rows > MAX_ROWS) {
      System.out.println("Must be 100 rows or fewer");
     } else if (rows < MIN_ROWS) {
      System.out.println("Must be at least 3 rows");
     }
     System.out.println("How many rows should be on the board?");
     rows = Integer.parseInt(scanner.nextLine());
    }


    System.out.println("How many columns should be on the board?");
    int columns = Integer.parseInt(scanner.nextLine());
    while (columns > MAX_COLUMNS || columns < MIN_COLUMNS) {
     if (columns > MAX_COLUMNS) {
      System.out.println("Must be 100 columns or fewer");
     } else if (columns < MIN_COLUMNS) {
      System.out.println("Must be at least 3 columns");
     }
     System.out.println("How many columns should be on the board?");
     columns = Integer.parseInt(scanner.nextLine());
    }


    System.out.println("How many in a row to win?");
    int tokensToWin = Integer.parseInt(scanner.nextLine());
    while (tokensToWin > MAX_TOKENS || tokensToWin < MIN_TOKENS) {
     if (tokensToWin > MAX_TOKENS) {
      System.out.println("Must be 25 tokens or fewer");
     } else if (tokensToWin < MIN_TOKENS) {
      System.out.println("Must be at least 3 tokens");
     }
     System.out.println("How many in a row to win?");
     tokensToWin = Integer.parseInt(scanner.nextLine());
    }



    System.out.println("Would you like a Fast Game (F/f) or a Memory Efficient Game (M/m)?");
    String gameChoice = scanner.nextLine().toUpperCase();
    while (!gameChoice.equals("F") && !gameChoice.equals("M")) {
     System.out.println("Please enter F or M");
     gameChoice = scanner.nextLine().toUpperCase();
    }


    // Create a new game board for each game
    IGameBoard boardObject;
    if (gameChoice.equals("F")) {
     boardObject = new GameBoard(rows, columns, tokensToWin);
    } else {
     boardObject = new GameBoardMem(rows, columns, tokensToWin);
    }

    int currIndex = 0;
    char currPlayer = players.get(currIndex);
    int COL = -1;
    boolean screen = true;

    while (screen) {
     // Print the game board to the console
     System.out.println(boardObject.toString());

     // Initialize the valid column variable to false at the start of each turn
     boolean columnISValid = false;

     //loop until valid column
     while (!columnISValid) {
      System.out.println("Player " + currPlayer + ", what column do you want to place your marker in?");
      COL = Integer.parseInt(scanner.nextLine());

      // Check for invalid column input
      if (COL < 0) {
       System.out.println("Column cannot be less than 0");
      } else if (COL >= boardObject.getNumColumns()) {
       System.out.println("Column cannot be greater than " + (boardObject.getNumColumns() - 1));
      } else if (!boardObject.checkIfFree(COL)) {
       System.out.println("Column is full");
      } else {
       columnISValid = true;
      }
     }

     boardObject.placeToken(currPlayer, COL);

     if (boardObject.checkForWin(COL)) {
      System.out.println(boardObject.toString());
      System.out.println("Player " + currPlayer + " Won!");
      screen = false;

     } else if (boardObject.checkTie()) {
      System.out.println(boardObject.toString());
      System.out.println("The game is a tie!");
      screen = false;
     }
     // This block should be outside the while (loop) block
     if (screen) {
      currIndex = (currIndex + 1) % numPlayers;
      currPlayer = players.get(currIndex);
     }
    }


    System.out.println("Would you like to play again? Y/N");
    String input = scanner.nextLine().toUpperCase();
    game = input.equals("Y");
   }

  }
 }
