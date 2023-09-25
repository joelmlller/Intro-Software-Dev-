 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * March 7, 2023
  */



package cpsc2150.extendedConnectX.models;

 /**
  * An interface representing a game board.
  * A game board is a grid-like data structure used in various board games.
  * It provides methods for querying the current state of the board, as well
  * as making and undoing moves on the board.
  *
  * Initialization ensures:
  * The game board is in a valid starting state according to the rules of the game.
  *
  * Defines:
  *
  * ROWS: the number of rows on the game board.
  *
  * COLUMNS: the number of columns on the game board.
  *
  * Constraints:
  * ROWS > 0, COLUMNS > 0
  */
public interface IGameBoard {

     char[][] board = new char[9][7];

     /**
      * Returns true if the column can accept another token; false otherwise.
      *
      * * @param c The column to check.
      * @return True if the column is free, false otherwise.
      * @post returns true if there is at least one row in column `c` that is empty; false otherwise.
      */
     public default boolean checkIfFree(int c){
         BoardPosition bp = new BoardPosition(getNumRows() - 1, c);
         if(whatsAtPos(bp) == ' ')
         {
             return true;
         }
         return false;
     }
     /**
      * Returns the character that is in the GameBoard at the specified position.
      * If no marker is present at the position, a blank space character is returned.
      *
      * @param pos the BoardPosition to check for a marker
      * @return the character at the specified position, or a blank space character if no marker is present
      * @throws IndexOutOfBoundsException if the specified position is outside the bounds of the GameBoard
      */
     public char whatsAtPos(BoardPosition pos);
     /**
      * Places the character p in column c. The token will be placed in
      * the lowest available row in column c.
      *
      * @param p The player's token (e.g. 'X' or 'O').
      * @param c The column to place the token in.
      * @post a new token `p` has been placed in column `c` at the lowest available row.
      */
     public void placeToken(char p, int c);
     /**
      * This function will check to see if the last token placed in
      * column c resulted in the player winning the game. If so, it will return
      * true, otherwise false.
      * @pre  c is the column where the latest token was placed
      * @param c The column where the last token was placed.
      * @return True if the placed token is the last to make up the maximum number
      * of consecutive same markers needed to win either vertically, horizontally, or diagonally, false otherwise.
      * @Post returns true if the last token placed in column c results in a winning condition; false otherwise
      */
     public default boolean checkForWin(int c){
         //the BoardPosition and person variables
         BoardPosition bp = null;
         char person = '.';

         // Iterate over the rows of the board, starting from 1
         for (int j = 1; j < getNumRows(); j++)
         {
             // a new BoardPosition at the current row and column c
             bp = new BoardPosition(j, c);


             // If the position is empty, create a new BoardPosition at the row
             if (whatsAtPos(bp) == ' ')
             {
                 bp = new BoardPosition(j - 1, c);

                 person = whatsAtPos(bp);
                 // Exit the loop if found  person
                 break;
             }
         }
         //check horizontical win
         if(checkHorizWin(bp, person))
         {
             return true;
         }
         //check vetical win
         if(checkVertWin(bp, person))
         {
             return true;
         }
         //check diagnol win
         if(checkDiagWin(bp, person))
         {
             return true;
         }
         //return false if there are no wins
         return false;
     }
     /**
      * This function will check to see if the game has resulted in a
      * tie. A game is tied if there are no free board positions remaining.
      * You do not need to check for any potential wins because we can assume
      * that the players were checking for win conditions as they played the
      * game. It will return true if the game is tied and false otherwise.
      *
      * @return True if the game is a tie, false otherwise.
      * @post returns true if there are no more empty positions in the game board; false otherwise.
      */
     public default boolean checkTie(){

         //iterates through each column on the game board
         for(int i = 0; i < getNumColumns(); i++){

             //if any available moves in that column
             if (checkIfFree(i)){
                 //the game is not tied
                 return false;
             }
         }
        //the game is tied
         return true;
     }

     /**
      * checks to see if the last token placed (which was placed in
      * position pos by player p) resulted in 5 in a row horizontally. Returns
      * true if it does, otherwise false.
      *
      * @param pos The BoardPosition of the last token placed.
      * @param p   The player's token
      * @return True if the player has won, false otherwise.
      * @post returns true if there are 5 consecutive tokens of
      *       player `p` horizontally in the row of `pos`; false otherwise.
      */
     public default boolean checkHorizWin(BoardPosition pos, char p){

         //counter variable and a BoardPosition object
         int num = 1;
         BoardPosition bp = null;
         //to the right
         for(int j = pos.getColumn() + 1; j < getNumColumns(); j++) {
             //new boardposition object
             bp = new BoardPosition(pos.getRow(), j);

             // If contents are same then increment counter
             if (whatsAtPos(pos) == whatsAtPos(bp)) {
                 num++;
             }
             // If contents are different then exit loop
             else {
                 break;
             }
         }
         //to the left
         for(int k = pos.getColumn() - 1; k >= 0; k--)
         {
             //new boardposition object
             bp = new BoardPosition(pos.getRow(), k);

             // If contents are same then increment counter
             if (whatsAtPos(pos) == whatsAtPos(bp))
             {
                 num++;
             }
             // If contents are different then exit loop
             else {
                 break;}
         }

         // return true if player has won horizontally
         if(num >= getNumToWin())
         {
             return true;
         }
         // return false if player has not won horizontally
         else {
             return false;
         }
     }
     /**
      * Checks to see if the last token placed (which was placed in
      * position pos by player p) resulted in 5 in a row vertically. Returns
      * true if it does, otherwise false.
      *
      * @param pos The BoardPosition of the last token placed.
      * @param p   The player's token
      * @return True if the player has won, false otherwise.
      * @post returns true if there are 5 consecutive tokens of player `p`
      *      vertically in the column of `pos`; false otherwise.
      */
     public default boolean checkVertWin(BoardPosition pos, char p) {
         int count = 1;

         // Check positions below the current position
         for (int row = pos.getRow() + 1; row < getNumRows()
                 && isPlayerAtPos(new BoardPosition(row, pos.getColumn()), p); row++) {
             count++;
         }

         // Check positions above the current position
         for (int row = pos.getRow() - 1; row >= 0
                 && isPlayerAtPos(new BoardPosition(row, pos.getColumn()), p); row--) {
             count++;
         }
         //returns the count to the getnumtowin
         return count >= getNumToWin();
     }
     /**
      * checks to see if the last token placed (which was placed in
      * position pos by player p) resulted in 5 in a row diagonally. Returns
      * true if it does, otherwise false
      *
      * @param pos The BoardPosition of the last token placed.
      * @param p   The player's token
      * @return True if the player has won, false otherwise.
      * @post returns true if there are 5 consecutive tokens of player `p`
      *       diagonally in the column of `pos`; false otherwise.
      */
     public default boolean checkDiagWin(BoardPosition pos, char p) {
         int row = pos.getRow();
         int col = pos.getColumn();
         int count = 1;

         // Check diagonal from bottom left to top right
         while (row > 0 && col < getNumColumns() - 1
                 && isPlayerAtPos(new BoardPosition(row - 1, col + 1), p)) {
             count++;
             row--;
             col++;
         }

         row = pos.getRow();
         col = pos.getColumn();

         // Check diagonal from top left to bottom right
         while (row < getNumRows() - 1
                 && col < getNumColumns() - 1
                 && isPlayerAtPos(new BoardPosition(row + 1, col + 1), p)) {
             count++;
             row++;
             col++;
         }

         if (count >= getNumToWin()) {
             return true;
         }
         count = 1;
         row = pos.getRow();
         col = pos.getColumn();

         // Check diagonal from top right to bottom left
         while (row < getNumRows() - 1 && col > 0
                 && isPlayerAtPos(new BoardPosition(row + 1, col - 1), p)) {
             count++;
             row++;
             col--;
         }

         row = pos.getRow();
         col = pos.getColumn();

         // Check diagonal from bottom right to top left
         while (row > 0 && col > 0
                 && isPlayerAtPos(new BoardPosition(row - 1, col - 1), p)) {
             count++;
             row--;
             col--;
         }

         return count >= getNumToWin();
     }
     /**
      * Returns true if the player is at pos; otherwise, it returns false
      *
      * @param pos The board position to check
      * @param player The player character to search for
      * @return `true` if the player is at the given position; `false` otherwise.
      *
      * @post `getPlayerAtPos(pos) == player` if the method returns `true`;
      *       `getPlayerAtPos(pos) != player` if the method returns `false`
      */
     public default boolean isPlayerAtPos(BoardPosition pos, char player){
         //determine the player at the given position
         if(whatsAtPos(pos) == player)
         {
             //if match return true
             return true;
         }
         //if not match return false
         return false;
     }
     /**
      * returns the number of rows in the GameBoard
      *
      * @return  The number of rows
      * @post getNumRows = r
      */
     public int getNumRows();
     /**
      * returns the number of columns in the GameBoard
      *
      * @return  The number of columns
      * @post getNumColumns = c
      */
     public int getNumColumns();

     /**
      * returns the number of tokens in a row needed to win the game
      *
      * @return  The number of tokens
      *
      */
     public int getNumToWin();


}
