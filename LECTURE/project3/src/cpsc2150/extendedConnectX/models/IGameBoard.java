 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * March 28, 2023
  */



package cpsc2150.extendedConnectX.models;

 /**
  * An interface representing a 2D game board where (0,0) is the bottom left of the board.
  * A game board is a grid-like data structure used in various board games.
  * It provides methods for querying the current state of the board, as well
  * as making and undoing moves on the board.
  *
  * Initialization ensures:
  * The game board is in a valid starting state according to the rules of the game and has dimensions of
  * getNumRows() by getNumColumns().
  * The board contains only blank characters at the beginning of the game.
  *
  * @invariant 0 {@code <=} getNumRows() {@code <=} {@value Integer#MAX_VALUE},
  * 0 {@code <=} getNumColumns() {@code <=} {@value Integer#MAX_VALUE},
  * and 0 {@code <} getNumToWin() {@code <=} min(getNumRows(), getNumColumns()).
  *
  */
public interface IGameBoard {

    // char[][] board = new char[9][7];

     /**
      * Returns true if the column can accept another token; false otherwise.
      *
      * @param c The column to check.
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
     default boolean checkForWin(int c){

         for(int i =0; i < getNumRows(); i++){
             BoardPosition pos2 = new BoardPosition(i,c);
             if(whatsAtPos(pos2) != ' '){
                 if(checkHorizWin(pos2, whatsAtPos(pos2)) || checkVertWin(pos2, whatsAtPos(pos2)) ||
                         checkDiagWin(pos2, whatsAtPos(pos2))){
                     return true;
                 }
             }
         }
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
     default boolean checkHorizWin(BoardPosition pos, char p){
         int row = pos.getRow();
         int col = pos.getColumn();


         int leftmost= Math.max(0, col - (getNumToWin()-1));
         int rightmost = Math.min(getNumColumns() - 1, col + (getNumToWin()-1));

         boolean pass = true;
         int i, j;

         for(i = leftmost; i + getNumToWin() - 1 <= rightmost; i++){
             for(j = 0; j < getNumToWin(); j++) {
                 BoardPosition pos2 = new BoardPosition(row, i + j);

                 if (whatsAtPos(pos2) != p) {
                     pass = false;
                 }
             }
             if(pass){
                 return true;
             }

             pass = true;

         }

         return false;
     };
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
     default boolean checkVertWin(BoardPosition pos, char p){

         int row = pos.getRow();
         int col = pos.getColumn();
         int i;

         if(row - (getNumToWin() - 1) > -1){
             for(i = 0; i < getNumToWin(); i++){
                 BoardPosition pos2 = new BoardPosition(row - i,col);
                 if(whatsAtPos(pos2) != p){
                     return false;
                 }
             }
             return true;
         }

         else return false;
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
