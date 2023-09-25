 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * April 13, 2023
  */


 package cpsc2150.extendedConnectX.models;


 /**
  * This class keeps track of an individual cell on a game board thus representing the game board
  * @invariant 0 {@code <=} row {@code <=} ROWS AND 0 {@code <=} column {@code <=} COLUMNS
  *            AND there are no "gaps" between non-space tokens
  * @correspondence ROWS = numRows, COLUMNS = numColumns, NUM_TO_WIN = numToWin
  */
 public class GameBoard extends AbsGameBoard implements IGameBoard {

     private final int ROWS;
     private final int COLUMNS;
     private final int NUM_TO_WIN;
     private char[][] board;

     /**
      * This class represents an individual cell on a game board, as well as the entire game board itself.
      * @param numRows the number of rows for the game board
      * @param numColumns the number of columns for the game board
      * @param numToWin the number of tokens in a row needed to win
      * @pre the row and column parameters must be valid indices within the bounds of the game board.
      * Specifically, 0 {@code <=} row {@code <} numRows and 0 {@code <=} column {@code <} numColumns.
      * @post A new GameBoard object is created with an empty board of size numRows x numColumns.
      * Each position on the board is initialized to contain a space character ' '.
      */
     public GameBoard(int numRows, int numColumns, int numToWin) {
         ROWS = numRows;
         COLUMNS = numColumns;
         NUM_TO_WIN = numToWin;
         board = new char[COLUMNS][ROWS];
         for (int i = 0; i < COLUMNS; i++) {
             for (int j = 0; j < ROWS; j++) {
                 board[i][j] = ' ';
             }
         }
     }

//returns the number of rows on the board
  public int getNumRows()
  {
   return ROWS;
  }

//returns the number of columns on the board
  public int getNumColumns()
  {
         return COLUMNS;
  }

//returns the number of tokens in a row needed to win the game
  public int getNumToWin()
  {
         return NUM_TO_WIN;
  }

//places a token on  board in column c for player p
  public void placeToken(char p, int c) {
   int row3 = 0;
   while (row3 < ROWS && board[c][row3] != ' ')
   {
       row3++;
   }
   //an empty space then place the token there
   if (row3 < ROWS)
   {
    board[c][row3] = p;
   }
  }

  //return the char at the given boardPosition
  public char whatsAtPos(BoardPosition pos)
  {
   int row = pos.getRow();
   int col = pos.getColumn();

      //return the char at the given row and column on the board
      return board[col][row];
  }

 }
