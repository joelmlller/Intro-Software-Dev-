/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 6
 * Due: 2/24/23
 */

package cpsc2150.MyDeque;

/**
 *  The array implementation of the deque
 *
 *  @invariant      0 <= myLength <= MAX_LENGTH
 *
 *  @correspondence self = myQ[0..myLength-1]
 */
public class ArrayDeque<T> extends AbsDeque<T> implements IDeque<T> {

    // Where the data is stored. myQ[0] is the front of the deque
    private T[] myQ;
    // The current length of the dequeue
    // Also used to find the end of the deque
    private int myLength;

    /**
     *  Constructs an Integer array that holds the deque
     *
     *  @post   myQ = [a T array of MAX_LENGTH] AND
     *          myLength = 0
     */
    public ArrayDeque() {
        myQ = (T[]) new Object[MAX_LENGTH];
        myLength = 0;
    }

    public void enqueue(T x) {
        myQ[myLength++] = x;
    }

    public T dequeue() {
        T result = myQ[0];
        for (int i = 0; i < myLength - 1; i++) {
            myQ[i] = myQ[i + 1];
        }
        myLength--;
        return result;
    }

    public void inject(T x) {
        for (int i = myLength; i > 0; i--) {
            myQ[i] = myQ[i - 1];
        }
        myQ[0] = x;
        myLength++;
    }

    public T removeLast() {
        return myQ[--myLength];
    }

    public int length() {
        return myLength;
    }

    public void clear() {
        myLength = 0;
    }

    public T peek() {
        return myQ[0];
    }

    public T endOfDeque() {
        return myQ[myLength - 1];
    }

    public void insert(T x, int pos) {
        for (int i = myLength; i >= pos; i--) {
            myQ[i] = myQ[i - 1];
        }
        myQ[pos - 1] = x;
        myLength++;
    }

    public T remove(int pos) {
        T result = myQ[pos - 1];
        for (int i = pos - 1; i < myLength - 1; i++) {
            myQ[i] = myQ[i + 1];
        }
        myLength--;
        return result;
    }

    public T get(int pos) {
        return myQ[pos - 1];
    }

}




