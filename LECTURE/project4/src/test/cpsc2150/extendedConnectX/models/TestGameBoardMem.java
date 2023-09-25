 /* CPSC 2150 - Final Project
  * Joel Miller
  * Connect X
  * April 13, 2023
  */


 package cpsc2150.extendedConnectX.models;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;


public class TestGameBoardMem {
  private IGameBoard createBoard(int rows, int columns, int numToWin) {
   return new GameBoardMem(rows, columns, numToWin);
  }

  // Helper method to convert 2D array to string representation
  private String arrayToString(char[][] array) {
   StringBuilder sb = new StringBuilder();

   // Print column numbers at the top
   sb.append("|");
   for (int col = 0; col < array[0].length; col++) {
    if (col < 10) {
     sb.append(" ");
    }
    sb.append(col);
    sb.append("|");
   }
   sb.append("\n");

   // Print board rows in reverse order
   for (int row = array.length - 1; row >= 0; row--) {
    sb.append("|");
    for (int col = 0; col < array[row].length; col++) {
     sb.append(array[row][col]);
     sb.append(" |");
    }
    sb.append("\n");
   }

   return sb.toString();
  }

  @Test
  public void testConstructor_0_1() {
   int rows = 3;
   int columns = 3;
   int numToWin = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }

  @Test
  public void testConstructor_0_2() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }

  @Test
  public void testConstructor_0_3() {
   int rows = 5;
   int columns = 5;
   int numToWin = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }

  @Test
  public void testPlaceToken_0_1() {
   int rows = 5;
   int columns = 5;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenX, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }

  @Test
  public void testPlaceToken_0_2() {
   int rows = 5;
   int columns = 5;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken0);        expected[4][columnToPlaceToken0] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }

  @Test
  public void testPlaceToken_0_3() {
   int rows = 5;
   int columns = 5;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }
  @Test
  public void testPlaceToken_0_4() {
   int rows = 5;
   int columns = 5;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[4][columnToPlaceToken0] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }

  @Test
  public void testPlaceToken_0_5() {
   int rows = 5;
   int columns = 5;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenX, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[1][columnToPlaceToken4] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[2][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[3][columnToPlaceToken4] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[4][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[4][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[4][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[4][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[4][columnToPlaceToken4] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());
  }

  @Test
  public void testCheckIfFree_0_1() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkIfFree(0));
  }

  @Test
  public void testCheckIfFree_0_2() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);
   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkIfFree(0));
  }
  @Test
  public void testCheckIfFree_0_3() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;


   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkIfFree(0));
  }

  @Test
  public void testCheckHorizWin_0_1() {
   int rows = 4;
   int columns = 4;
   int numToWin = 3;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkHorizWin(new BoardPosition(1,2),'X'));
  }

  @Test
  public void testCheckHorizWin_0_2() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenX, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkHorizWin(new BoardPosition(1,2),'O'));
  }

  @Test
  public void testCheckHorizWin_0_3() {
   int rows = 4;
   int columns = 5;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenX, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkHorizWin(new BoardPosition(0,4),'X'));
  }

  @Test
  public void testCheckHorizWin_0_4() {
   int rows = 6;
   int columns = 6;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;
   int columnToPlaceToken5 = 5;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[0][columnToPlaceToken5] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkHorizWin(new BoardPosition(0,3),'X'));
  }

  @Test
  public void testCheckVertWin_0_1() {
   int rows = 3;
   int columns = 3;
   int numToWin = 3;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkVertWin(new BoardPosition(2,1),'X'));
  }

  @Test
  public void testCheckVertWin_0_2() {
   int rows = 6;
   int columns = 7;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';
   char tokenS = 'S';
   char tokenF = 'F';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;
   int columnToPlaceToken5 = 5;
   int columnToPlaceToken6 = 6;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenF, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenF;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenS, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenS;
   gb.placeToken(tokenS, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenS;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[0][columnToPlaceToken5] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken6);        expected[0][columnToPlaceToken6] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenF, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenF;
   gb.placeToken(tokenF, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenF;
   gb.placeToken(tokenF, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenF;
   gb.placeToken(tokenS, columnToPlaceToken4);        expected[1][columnToPlaceToken4] = tokenS;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[1][columnToPlaceToken5] = tokenX;

   gb.placeToken(tokenS, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenS;
   gb.placeToken(tokenS, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenS;
   gb.placeToken(tokenF, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenF;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[2][columnToPlaceToken4] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[2][columnToPlaceToken5] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken5);        expected[3][columnToPlaceToken5] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[4][columnToPlaceToken5] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkVertWin(new BoardPosition(4,5),'X'));
  }

  @Test
  public void testCheckVertWin_0_3() {
   int rows = 6;
   int columns = 6;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';


   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[4][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[5][columnToPlaceToken2] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkVertWin(new BoardPosition(5,2),'O'));
  }

  @Test
  public void testCheckVertWin_0_4() {
   int rows = 5;
   int columns = 10;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';


   int columnToPlaceToken5 = 5;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[0][columnToPlaceToken5] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken5);        expected[1][columnToPlaceToken5] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[2][columnToPlaceToken5] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken5);        expected[3][columnToPlaceToken5] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[4][columnToPlaceToken5] = tokenX;



   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkVertWin(new BoardPosition(4,5),'X'));
  }

  @Test
  public void testCheckDiagWin_0_1() {
   int rows = 3;
   int columns = 3;
   int numToWin = 3;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkDiagWin(new BoardPosition(2,0),'X'));
  }

  @Test
  public void testCheckDiagWin_0_2() {
   int rows = 6;
   int columns = 5;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }

   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[1][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[2][columnToPlaceToken4] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[3][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken4);        expected[4][columnToPlaceToken4] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkDiagWin(new BoardPosition(4,4),'X'));
  }

  @Test
  public void testCheckDiagWin_0_3() {
   int rows = 5;
   int columns = 4;
   int numToWin = 3;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }

   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenX, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkDiagWin(new BoardPosition(2,2),'X'));
  }

  @Test
  public void testCheckDiagWin_0_4() {
   int rows = 6;
   int columns = 6;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';


   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }

   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkDiagWin(new BoardPosition(3,1),'X'));
  }

  @Test
  public void testCheckDiagWin_0_5() {
   int rows = 6;
   int columns = 7;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';


   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;
   int columnToPlaceToken5 = 5;
   int columnToPlaceToken6 = 6;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }

   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array

   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[0][columnToPlaceToken5] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken6);        expected[0][columnToPlaceToken6] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[1][columnToPlaceToken4] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[1][columnToPlaceToken5] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken6);        expected[1][columnToPlaceToken6] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken4);        expected[2][columnToPlaceToken4] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken5);        expected[2][columnToPlaceToken5] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken6);        expected[2][columnToPlaceToken6] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken5);        expected[3][columnToPlaceToken5] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken6);        expected[3][columnToPlaceToken6] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken6);        expected[4][columnToPlaceToken6] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkDiagWin(new BoardPosition(4,6),'X'));
  }

  @Test
  public void testCheckDiagWin_0_6() {
   int rows = 8;
   int columns = 9;
   int numToWin = 5;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;
   int columnToPlaceToken5 = 5;
   int columnToPlaceToken6 = 6;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }

   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken5);        expected[0][columnToPlaceToken5] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken6);        expected[0][columnToPlaceToken6] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[1][columnToPlaceToken4] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[1][columnToPlaceToken5] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[2][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkDiagWin(new BoardPosition(3,3),'X'));
  }

  @Test
  public void testCheckDiagWin_0_7() {
   int rows = 8;
   int columns = 7;
   int numToWin = 7;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;
   int columnToPlaceToken4 = 4;
   int columnToPlaceToken5 = 5;
   int columnToPlaceToken6 = 6;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }

   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken4);        expected[0][columnToPlaceToken4] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken5);        expected[0][columnToPlaceToken5] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken6);        expected[0][columnToPlaceToken6] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[1][columnToPlaceToken4] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken5);        expected[1][columnToPlaceToken5] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken4);        expected[2][columnToPlaceToken4] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkDiagWin(new BoardPosition(3,3),'O'));
  }

  @Test
  public void testCheckTie_0_1() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;


   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkTie());
  }

  @Test
  public void testCheckTie_0_2() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;


   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkTie());
  }

  @Test
  public void testCheckTie_0_3() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;


   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.checkTie());
  }

  @Test
  public void testCheckTie_0_4() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.checkTie());
  }

  @Test
  public void testWhatsAtPos_0_1() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   char actualChar = gb.whatsAtPos(new BoardPosition(0,0));
   char expectedChar = 'O';

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   // Check if the result of the whatsAtPos method is equal to the expected character
   assertEquals(expectedChar, actualChar);
  }

  @Test
  public void testWhatsAtPos_0_2() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call the whatsAtPos method and store the result in a variable
   char actualChar = gb.whatsAtPos(new BoardPosition(2,1));
   char expectedChar = 'X';

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   // Check if the result of the whatsAtPos method is equal to the expected character
   assertEquals(expectedChar, actualChar);
  }

  @Test
  public void testWhatsAtPos_0_3() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   char actualChar = gb.whatsAtPos(new BoardPosition(3,2));
   char expectedChar = ' ';

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   // Check if the result of the whatsAtPos method is equal to the expected character
   assertEquals(expectedChar, actualChar);
  }

  @Test
  public void testWhatsAtPos_0_4() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken3 = 3;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   char actualChar = gb.whatsAtPos(new BoardPosition(0,2));
   char expectedChar = ' ';

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   // Check if the result of the whatsAtPos method is equal to the expected character
   assertEquals(expectedChar, actualChar);
  }

  @Test
  public void testWhatsAtPos_0_5() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;


   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   char actualChar = gb.whatsAtPos(new BoardPosition(3,3));
   char expectedChar = ' ';

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   // Check if the result of the whatsAtPos method is equal to the expected character
   assertEquals(expectedChar, actualChar);
  }

  @Test
  public void testisPlayerAtPos_0_1() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenO;


   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.isPlayerAtPos(new BoardPosition(0,0),'O'));
  }

  @Test
  public void testisPlayerAtPos_0_2() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[3][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenO;


   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertTrue(gb.isPlayerAtPos(new BoardPosition(2,1),'X'));
  }

  @Test
  public void testisPlayerAtPos_0_3() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken3);        expected[1][columnToPlaceToken3] = tokenO;

   gb.placeToken(tokenO, columnToPlaceToken0);        expected[2][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[2][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenO, columnToPlaceToken1);        expected[3][columnToPlaceToken1] = tokenO;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[3][columnToPlaceToken3] = tokenX;


   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.isPlayerAtPos(new BoardPosition(3,0),'O'));
  }

  @Test
  public void testisPlayerAtPos_0_4() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken0 = 0;
   int columnToPlaceToken1 = 1;
   int columnToPlaceToken2 = 2;
   int columnToPlaceToken3 = 3;

   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken0);        expected[0][columnToPlaceToken0] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[0][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;
   gb.placeToken(tokenX, columnToPlaceToken3);        expected[0][columnToPlaceToken3] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken0);        expected[1][columnToPlaceToken0] = tokenX;
   gb.placeToken(tokenX, columnToPlaceToken1);        expected[1][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken1);        expected[2][columnToPlaceToken1] = tokenX;
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenO;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.isPlayerAtPos(new BoardPosition(1,2),'X'));
  }

  @Test
  public void testisPlayerAtPos_0_5() {
   int rows = 4;
   int columns = 4;
   int numToWin = 4;

   char tokenX = 'X';
   char tokenO = 'O';

   int columnToPlaceToken2 = 2;


   // Create an empty "expected" 2D array
   char[][] expected = new char[rows][columns];
   for (int row = 0; row < rows; row++) {
    for (int col = 0; col < columns; col++) {
     expected[row][col] = ' ';
    }
   }
   // Call the factory method to create your empty IGameBoard object "gb"
   IGameBoard gb = createBoard(rows, columns, numToWin);

   // Place a token in column 0 and update the "expected" array
   gb.placeToken(tokenO, columnToPlaceToken2);        expected[0][columnToPlaceToken2] = tokenO;

   gb.placeToken(tokenX, columnToPlaceToken2);        expected[1][columnToPlaceToken2] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken2);        expected[2][columnToPlaceToken2] = tokenX;

   gb.placeToken(tokenX, columnToPlaceToken2);        expected[3][columnToPlaceToken2] = tokenX;

   // Call your helper method to create the expected string version of your 2D array
   String expectedString = arrayToString(expected);

   // Call assertEquals to ensure your expected string and gb.toString() are equivalent
   assertEquals(expectedString, gb.toString());

   assertFalse(gb.isPlayerAtPos(new BoardPosition(3,3),'O'));
  }

 }






