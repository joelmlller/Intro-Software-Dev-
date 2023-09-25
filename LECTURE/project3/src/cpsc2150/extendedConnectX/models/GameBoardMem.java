 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * March 28, 2023
  */



package cpsc2150.extendedConnectX.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 /**
  * A GameBoardMem represents a game board that is stored in memory. It extends the AbsGameBoard abstract class and
  * implements the IGameBoard interface. The board is represented as a Map<Character, List<BoardPosition>> where the
  * keys are the players and the values are the list of positions that the player has marked on the board.
  *
  * @invariant
  *            0 {@code <=} ROWS {@code <=} {@value Integer#MAX_VALUE},
  *            0 {@code <=} COLUMNS {@code <=} {@value Integer#MAX_VALUE},and
  *            0 {@code <} NUM_TO_WIN {@code <=} min(ROWS, COLUMNS)
  *
  * @correspondence
  * ROWS corresponds to the number of rows on the game board.
  * COLUMNS corresponds to the number of columns on the game board.
  * NUM_TO_WIN corresponds to the number of marks in a row required to win the game.
  * board corresponds to a map where the keys are characters representing players,
  * and the values are lists of BoardPositions
  * representing the positions on the board that each player has marked.
  */
public class GameBoardMem extends AbsGameBoard implements IGameBoard {
    private final int ROWS;
    private final int COLUMNS;
    private final int NUM_TO_WIN;
    private Map<Character, List<BoardPosition>> board;


    /**
     * Creates a new GameBoardMem with the given number of rows, columns, and marks required to win.
     *
     * @param numRows    the number of rows in the game board.
     * @param numColumns the number of columns in the game board.
     * @param numToWin   the number of marks in a row required to win the game.
     * @pre numRows, numColumns, and numToWin are all greater than 0.
     * @post A new GameBoardMem object is created with an empty board of size numRows x numColumns.
     */
    public GameBoardMem(int numRows, int numColumns, int numToWin) {
        ROWS = numRows;
        COLUMNS = numColumns;
        NUM_TO_WIN = numToWin;
        board = new HashMap<>();
    }

    public int getNumRows() {
        return ROWS;
    }

    public int getNumColumns() {
        return COLUMNS;
    }

    public int getNumToWin() {
        return NUM_TO_WIN;
    }

    public void placeToken(char p, int c) {
        int row = 0;
        boolean taken;

        // find the first available row in the specified column
        do {
            taken = false;
            BoardPosition pos = new BoardPosition(row, c);

            // check if any player already occupies the position
            for (Character player : board.keySet()) {
                if (isPlayerAtPos(pos, player)) {
                    taken = true;
                    break;
                }
            }
            if (taken) {
                row++;
            }
        } while (taken && row < ROWS);

        // place the token at the available position
        if (row < ROWS) {
            BoardPosition pos = new BoardPosition(row, c);
            if (!board.containsKey(p)) {
                board.put(p, new ArrayList<>());
            }
            board.get(p).add(pos);
        }
    }


    public char whatsAtPos(BoardPosition pos) {
        int row4 = pos.getRow();
        int col4 = pos.getColumn();

        // iterate through the board to find the player at the specified position
        for (Map.Entry<Character, List<BoardPosition>> entry : board.entrySet()) {

            for (BoardPosition pos2 : entry.getValue()) {

                if (pos2.getRow() == row4 && pos2.getColumn() == col4) {

                    return entry.getKey();
                }
            }
        }
        // if no player is found at the position, return empty character
        return ' ';
    }

    @Override
    public boolean isPlayerAtPos(BoardPosition pos, char player) {
        if (board.containsKey(player)) {
            return board.get(player).contains(pos);
        }
        return false;
    }
}
