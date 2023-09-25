 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * March 7, 2023
  */


 package cpsc2150.extendedConnectX.models;


 /**
  * This class keeps track of an individual cell on a game board thus representing the game board
  * @invariant 0 <= row <= 9 AND 0 <= column <= 7 AND there are no "gaps" between non-space tokens
  */
 public class GameBoard extends AbsGameBoard implements IGameBoard{

     //all variables set to private final
  private final int ROWS = 9;
  private final int COLUMNS = 7;
  private final int NUM_TO_WIN = 5;
  private char[][] board;


     /**
      * This class represents an individual cell on a game board, as well as the entire game board itself.
      * @pre the row and column parameters must be valid indices within the bounds of the game board.
      * Specifically, 0 <= row < numRows and 0 <= column < numColumns.
      * @post A new GameBoard object is created with an empty board of size numRows x numColumns.
      * Each position on the board is initialized to contain a space character ' '.
      */
     public GameBoard() {
      board = new char[COLUMNS][ROWS];
      for (int i = 0; i < COLUMNS; i++)
      {
       for (int j = 0; j < ROWS; j++)
       {
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
   int rod = 0;
   while (rod < ROWS && board[c][rod] != ' ')
   {
    rod++;
   }
   //an empty space then place the token there
   if (rod < ROWS)
   {
    board[c][rod] = p;
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
