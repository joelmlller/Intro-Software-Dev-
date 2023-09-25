/* Austin Wagner/ Joel Miller
 * CPSC 2151
 * Lab 4
 * Due: 2/10/23
 */

package cpsc2150.MyDeque;

/**
 A deque is a double-ended queue data structure that allows you to
 insert and remove from both ends.

 Initialization ensures:
    Queue contains nothing, i.e., an empty string <>
    AND indexing starts at 0

 Defines:       MAX_LENGTH: +Z

 Constraints:   0 <= length of a self <= MAX_LENGTH
 */
public interface IDeque {
    public static final int MAX_LENGTH = 100;

    /**
     *  Adds x to the end of the deque
     *  @param x    the integer to be added
     *
     *  @pre        length of self, |self| < MAX_LENGTH
     *  @post       self = x added to the back of #self
     */
    public void enqueue(Integer x);

    /**
     *  Removes and returns the integer at the front of the deque
     *
     *  @pre        length of self, |self| > 0
     *  @post       self = dequeue() removed from the front of #self
     *
     *  @return     the integer at the front of the deque
     */
    public Integer dequeue();

    /**
     *  Adds x to the front of the deque
     *  @param x    the integer to be added
     *
     *  @pre        length of self, |self| < MAX_LENGTH
     *  @post       self = x added to the front of #self
     */
    public void inject(Integer x);

    /**
     *  Removes and returns the integer at the end of the deque
     *
     *  @pre        length of self, |self| > 0
     *  @post       self = removeLast() removed from the front of #self
     *
     *  @return     the integer at the back of the deque
     */
    public Integer removeLast();

    /**
     *  Returns the number of integers in the deque
     *
     *  @post       self = #self
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

}

