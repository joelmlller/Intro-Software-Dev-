 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * April 13, 2023
  */

 package cpsc2150.extendedConnectX.models;

/**
 * This class will be used to keep track of an individual cell for a board.
 * BoardPosition will have variables to represent the Row position and the
 * Column position.
 *
 * @invariant 0 {@code <=} row {@code <=} 9 AND 0 {@code <=} column {@code <=} 7
 *
 */
public class BoardPosition {
    private final int row;
    private final int col;


    /**
     * This constructor will take in an int for the Row
     * position and an int for the Column position.
     *
     * @param   row The row position
     * @param   col The column position
     * @pre     0 {@code <=} row {@code <=} 9 AND 0 {@code <=} column {@code <=} 7
     * @post       private class row = local row and private class column = local column.
     */
    public BoardPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Returns the row number of the BoardPosition.
     *
     * @return  The row position.
     * @post      getRow = row and row = #row and column = #column
     */
    public int getRow() {
        return row;
    }

    /**
     * Returns the column number of the BoardPosition.
     *
     * @return  The column position.
     * @post getColumn = column and column = #column and row = #row
     */
    public int getColumn() {
        return col;
    }


    /**
     * Overrides the equals method to determine if two BoardPositions have the same row and column.
     * @param obj The object to compare.
     * @return True if the two objects have the same row and column, false otherwise.
     * @post equals iff this.row = obj.row and this.column = obj.colum
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BoardPosition)) {
            return false;
        }
        BoardPosition other = (BoardPosition) obj;
        return this.row == other.row && this.col == other.col;
    }
    /**
     * Overrides the toString method to create a string in the format "row, column".
     *
     * @return The string format of the BoardPosition.
     * @post toString = "row, column"
     */
    @Override
    public String toString() {
        return row + "," + col;
    }

}
