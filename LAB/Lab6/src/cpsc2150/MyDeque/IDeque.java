/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 6
 * Due: 2/24/23
 */

package cpsc2150.MyDeque;

import javax.lang.model.type.NullType;

/**
 A deque is a double-ended queue data structure that allows you to
 insert and remove from both ends.

 Initialization ensures:
    Queue contains nothing, i.e., an empty string <>
    AND indexing starts at 0

 Defines:       MAX_LENGTH: +Z

 Constraints:  deque.length() > 0, deque.length() < MAX_LENGTH
 */
public interface IDeque<T> {
    int MAX_LENGTH = 100;

    /**
     *  Adds x to the end of the deque
     *  @param x    the integer to be added
     *
     *  @pre        length of self, |self| < MAX_LENGTH
     *  @post       self = x added to the back of #self
     */
     public void enqueue(T x);

    /**
     *  Removes and returns the integer at the front of the deque
     *
     *  @pre        length of self, |self| > 0
     *  @post       self = dequeue() removed from the front of #self
     *
     *  @return     the integer at the front of the deque
     */
  public T dequeue();

    /**
     *  Adds x to the front of the deque
     *  @param x    the integer to be added
     *
     *  @pre        length of self, |self| < MAX_LENGTH
     *  @post       self = x added to the front of #self
     */
    public void inject(T x);

    /**
     *  Removes and returns the integer at the end of the deque
     *
     *  @pre        length of self, |self| > 0
     *  @post       self = removeLast() removed from the front of #self
     *
     *  @return     the integer at the back of the deque
     */
   public  T removeLast();

    /**
     *  Returns the number of integers in the deque
     *
     *  @post       self = #self
     *              length = length of self, |self|
     *
     *  @return     the number of integers in the deque
     */
    public int length();

    /**
     *  Clears the entire deque
     *
     *  @pre        length of self, |self| > 0
     *
     *  @post       length of self, |self| = 0 AND
     *              self = all integers removed from #self
     */
    public void clear();

    /**
     * Checks the number at the front of the deque without manipulating it
     *
     * @pre         length of self, |self| > 0
     * @post        self = #self
     *
     * @return      the integer at the front of the deque
     */
    default T peek() {
        T temp = dequeue();

        inject(temp);
        return temp;
    }

    /**
     * Checks the number at the end of the deque without manipulating it
     *
     * @pre         length of self, |self| > 0
     * @post        self = #self
     *
     * @return      the integer at the back of the deque
     */
    default T endOfDeque() {
        T temp = removeLast();
        enqueue(temp);
        return temp;
    }

    /**
     * Inserts an integer at the position in the deque specified by the user
     *
     * @param x     the integer to be added
     * @param pos   the position in the deque where 'x' is being added
     *
     * @pre         1 <= pos <= length()
     * @post        self = x added at pos to #self
     */
    default void insert(T x, int pos) {
       T[] pop = (T[]) new Object [pos];

       for (int i =0; i < pos-1; i++) {


           pop[i] = dequeue();
       }
       inject(x);

       for(int i = pos-2; i >= 0; i--){

           inject(pop[i]);

       }

       }

    /**
     * Removes an integer at the position in the deque specified by the user
     *
     * @param pos   the position in the deque where the integer is being removed
     *
     * @pre         1 <= pos <= length()
     * @post        self = remove() at pos from #self
     *
     * @return      the integer at pos in the deque
     */
    default T remove(int pos) {
        T[] pop = (T[]) new Object [pos];
        T temp;
        for (int i = 0; i < pos - 1; i++) {


            pop[i] = dequeue();
        }
        temp = dequeue();

        for (int i = pos - 2; i >= 0; i--) {

            inject(pop[i]);

        }
        return temp;
    }

    /**
     * Checks the number at a position specified by the user without manipulating it
     *
     * @param pos   the position in the deque where the user is checking the value
     * @pre         1 <= pos <= length()
     * @post        self = #self
     *
     * @return      the integer at position pos in the deque
     */
    default T get(int pos) {
        if (pos == 1) {
            return peek();
        } else if (pos == length()) {
            return endOfDeque();
        } else {
            T result = null;
            for (int i = 1; i <= length(); i++) {
                T x = dequeue();
                if (i == pos) {
                    result = x;
                }
                enqueue(x);
            }
            return result;
        }
    }

}

