 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * April 13, 2023
  */


 package cpsc2150.extendedConnectX.models;

 /**
  * The abstract class AbsGameBoard implements the IGameBoard interface
  * and provides a default implementation for the toString method by calling
  * primary methods from the interface. It has no private data.
  */
public abstract class AbsGameBoard implements IGameBoard {

     /**
      * Returns a string representation of the game board
      * by calling the toString methods of each position on the board.
      *
      * @return a string representation of the game board
      */
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();

         // Print column numbers at the top
         sb.append("|");
         for (int col = 0; col < getNumColumns(); col++) {
             if (col < 10) {
                 sb.append(" ");
             }
             sb.append(col);
             sb.append("|");
         }
         sb.append("\n");

         // Print board rows in reverse order
         for (int row = getNumRows() - 1; row >= 0; row--) {
             sb.append("|");
             for (int col = 0; col < getNumColumns(); col++) {
                 sb.append(whatsAtPos(new BoardPosition(row, col)));
                 sb.append(" |");
             }
             sb.append("\n");
         }

         return sb.toString();
     }
 }



