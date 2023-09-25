package cpsc2150.subject;

import cpsc2150.observer.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * This class implements a mutable integer reference object, where it
 * notifies any interested observers about changes to its internal value.
 *
 * Steps for updating this file:
 * 1. Create and initialize a set/list of interested observers
 * 2. Notify our interested observers when we update our value
 * 3. Implement "registerObserver", "unregisterObserver" and "notifyObserver"
 *
 * Modified from https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 *
 * @version 1.0
 */
public class MyInteger {

    // Private data

    /**
     * List of interested observers
     */
    // Step 1 goes here

    /**
     * Integer value
     */
    private int myValue;

    // Constructor

    /**
     * No-argument constructor.
     */
    public MyInteger() {
        myValue = 0;
        // Step 1 goes here

    }

    // Public methods

    /**
     * This method returns the wrapped integer value.
     *
     * @return The internal integer value.
     */
    public int getValue() {
        return myValue;
    }

    /**
     * This method updates the wrapped integer value.
     *
     * @param newVal A new integer value
     */
    public void updateValue(int newVal) {
        myValue = newVal;

        // Step 2 goes here
        notifyAllObservers();
    }

    // Observer pattern-related

    /**
     * Register argument as observer/listener of this
     *
     * @param obs An interested observer
     */
    public void registerObserver(IObserver obs) {
        // Step 3 goes here


    }

    /**
     * Register argument as observer/listener of this
     *
     * @param obs An interested observer
     */
    public void unregisterObserver(IObserver obs) {
        // Step 3 goes here
    }

    /**
     * Notifies all interested observers that we have changed our internal value.
     */
    public void notifyAllObservers() {
        // Step 3 goes here
        for (IObserver observer : observerNum){
            observer.update(myValue);
        }
    }

}