/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 6
 * Due: 2/24/23
 */

package cpsc2150.MyDeque;

import java.util.*;

/**
 *  The linked list implementation of the deque
 *
 *  @invariant      0 <= myQ.size() <= MAX_LENGTH
 *
 *  @correspondence self = myQ[0..myLength-1]
 */
public class ListDeque<T> extends AbsDeque<T> implements IDeque<T>{


    // Deque is stored in a linked list
    // The front of the deque is accessed with myQ.get(0)
    private List<T> myQ;
    
    /**
     *  Constructs a linked list of Integers that holds the deque
     *
     *  @post   myQ = [a list of T of MAX_LENGTH] AND
     *          myQ.size() = 0
     */
    public ListDeque() {
        myQ = new LinkedList<>();
    }


    public void enqueue(T x) {
        myQ.add(x);
    }


    public T dequeue() {
        return myQ.remove(0);
    }


    public void inject(T x) {
        myQ.add(0, x);
    }


    public T removeLast() {
        return myQ.remove(myQ.size() - 1);
    }


    public int length() {
        return myQ.size();
    }


    public void clear() {
        myQ.clear();
    }


    public T peek() {
        return myQ.get(0);
    }

    public T endOfDeque() {
        return myQ.get(myQ.size() - 1);
    }

    public void insert(T x, int pos) {
        myQ.add(pos - 1, x);
    }

    public T remove(int pos) {
        return myQ.remove(pos - 1);
    }

    public T get(int pos) {
        return myQ.get(pos - 1);
    }



}

