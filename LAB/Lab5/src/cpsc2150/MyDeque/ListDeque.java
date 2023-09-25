/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 4
 * Due: 2/10/23
 */

package cpsc2150.MyDeque;

import java.util.*;

/**
 *  The linked list implementation of the deque
 *
 *  @invariant      0 <= myQ.size() < MAX_LENGTH
 *
 *  @correspondence self = [ List of Integers from myQ[0] to myQ[myQ.size()] ]
 */
public class ListDeque extends AbsDeque implements IDeque{


    // Deque is stored in a linked list
    // The front of the deque is accessed with myQ.get(0)
    private List<Integer> myQ;
    
    /**
     *  Constructs a linked list of Integers that holds the deque
     *
     *  @post   myQ.size() = 0 AND
     *          length of self, |self| = myQ.size()
     */
    public ListDeque() {
        myQ = new LinkedList<>();
    }


    public void enqueue(Integer x) {
        myQ.add(x);
    }


    public Integer dequeue() {
        if (myQ.isEmpty()) {
            System.out.println("Deque is empty.");
            return null;
        }

        return myQ.remove(0);
    }


    public void inject(Integer x) {
        myQ.add(0, x);
    }


    public Integer removeLast() {
        if (myQ.isEmpty()) {
            System.out.println("Deque is empty.");
            return null;
        }

        return myQ.remove(myQ.size() - 1);
    }


    public int length() {

        return myQ.size();
    }


    public void clear() {
        myQ.clear();
    }



    public Integer peek() {
        if (myQ.isEmpty()) {
            System.out.println("Deque is empty.");
            return null;
        }

        return myQ.get(0);
    }

    public Integer endOfDeque() {
        if (myQ.isEmpty()) {
            System.out.println("Deque is empty.");
            return null;
        }

        return myQ.get(myQ.size() - 1);
    }

    public void insert(Integer x, int pos) {
        if (pos < 1 || pos > myQ.size() + 1) {
            System.out.println("Invalid position.");
            return;
        }

        myQ.add(pos - 1, x);
    }

    public Integer remove(int pos) {
        if (pos < 1 || pos > myQ.size()) {
            System.out.println("Invalid position.");
            return null;
        }

        return myQ.remove(pos - 1);
    }

    public Integer get(int pos) {
        if (pos < 1 || pos > myQ.size()) {
            System.out.println("Invalid position.");
            return null;
        }

        return myQ.get(pos - 1);
    }



}

