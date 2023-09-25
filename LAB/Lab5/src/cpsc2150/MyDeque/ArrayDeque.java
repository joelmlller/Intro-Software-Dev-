/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 5
 * Due: 2/17/23
 */

package cpsc2150.MyDeque;

/**
 *  The array implementation of the deque
 *
 *  @invariant      0 <= myLength < MAX_LENGTH
 *
 *  @correspondence self = [ array of Integers from myQ[0] to myQ[myLength] ]
 */
public class ArrayDeque extends AbsDeque implements IDeque {

    // Where the data is stored. myQ[0] is the front of the deque
    private Integer[] myQ;
    // The current length of the dequeue
    // Also used to find the end of the deque
    private int myLength;

    /**
     *  Constructs an Integer array that holds the deque
     *
     *  @post   myLength = 0 AND
     *          length of self, |self| = myLength
     */
    public ArrayDeque() {
        myQ = new Integer[MAX_LENGTH];
        myLength = 0;
    }


    public void enqueue(Integer x) {
        if (myLength == MAX_LENGTH) {
            System.out.println("Deque is full.");
            return;
        }

        myQ[myLength++] = x;
    }


    public Integer dequeue() {
        if (myLength == 0) {
            System.out.println("Deque is empty.");
            return null;
        }

        Integer result = myQ[0];
        for (int i = 0; i < myLength - 1; i++) {
            myQ[i] = myQ[i + 1];
        }
        myLength--;
        return result;
    }


    public void inject(Integer x) {
        if (myLength == MAX_LENGTH) {
            System.out.println("Deque is full.");
            return;
        }

        for (int i = myLength; i > 0; i--) {
            myQ[i] = myQ[i - 1];
        }
        myQ[0] = x;
        myLength++;
    }


    public Integer removeLast() {
        if (myLength == 0) {
            System.out.println("Deque is empty.");
            return null;
        }

        return myQ[--myLength];
    }


    public int length() {
        return myLength;
    }


    public void clear() {
        myLength = 0;
    }


    public Integer peek() {
        if (myLength == 0) {
            System.out.println("Deque is empty.");
            return null;
        }

        return myQ[0];
    }

    public Integer endOfDeque() {
        if (myLength == 0) {
            System.out.println("Deque is empty.");
            return null;
        }

        return myQ[myLength - 1];
    }

    public void insert(Integer x, int pos) {
        if (myLength == MAX_LENGTH) {
            System.out.println("Deque is full.");
            return;
        }

        if (pos < 1 || pos > myLength + 1) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = myLength; i >= pos; i--) {
            myQ[i] = myQ[i - 1];
        }
        myQ[pos - 1] = x;
        myLength++;
    }

    public Integer remove(int pos) {
        if (myLength == 0) {
            System.out.println("Deque is empty.");
            return null;
        }

        if (pos < 1 || pos > myLength) {
            System.out.println("Invalid position.");
            return null;
        }

        Integer result = myQ[pos - 1];
        for (int i = pos - 1; i < myLength - 1; i++) {
            myQ[i] = myQ[i + 1];
        }
        myLength--;
        return result;
    }

    public Integer get(int pos) {
        if (myLength == 0) {
            System.out.println("Deque is empty.");
            return null;
        }

        if (pos < 1 || pos > myLength) {
            System.out.println("Invalid position.");
            return null;
        }

        return myQ[pos - 1];
    }

}




