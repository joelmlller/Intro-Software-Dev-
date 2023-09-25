package cpsc2150.observer;

import cpsc2150.subject.MyInteger;

/**
 * This class implements a binary converter where the value is printed out every time
 * {@link MyInteger} updates its value.
 *
 * Steps for updating this file:
 * 1. Register ourselves as an interested observer of "MyInteger"
 *
 * Modified from https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 *
 * @version 1.0
 */
public class BinaryObserver implements IObserver {

    // Private data

    /**
     * MyInteger subject
     */
    private MyInteger integer;

    // Constructor

    /**
     * No-argument constructor.
     */
    public BinaryObserver(MyInteger mi) {
        integer = mi;

        // Step 1 goes here
        integer.registerObserver(this);
    }

    // Callback method

    @Override
    public void update(int value) {
        System.out.println("Binary String: " + Integer.toBinaryString(value));
    }
}