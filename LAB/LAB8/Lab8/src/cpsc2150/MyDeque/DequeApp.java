/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 6
 * Due: 2/24/23
 */

package cpsc2150.MyDeque;

import java.util.Scanner;

public class DequeApp {
    public static void main(String [] args) {
        Scanner input = new java.util.Scanner(System.in);
        IDeque<Integer> q;

        int userChoice;

        do {
            System.out.println("Enter 1 for array implementation or 2 for List implementation");
            userChoice = Integer.parseInt(input.nextLine());
            System.out.println();
        } while (userChoice < 1 || userChoice > 2);

        if (userChoice == 1) {
            q = new ArrayDeque<>();
        } else {
            q = new ListDeque<>();
        }

        int option;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Add to the end of the deque");
            System.out.println("2. Add to the front of the deque");
            System.out.println("3. Remove from the front of the deque");
            System.out.println("4. Remove from the end of the deque");
            System.out.println("5. Peek from the front of the Deque ");
            System.out.println("6. Peek from the end of the Deque");
            System.out.println("7. Insert to a position in the Deque");
            System.out.println("8. Remove from a position in the Deque");
            System.out.println("9. Get a position in the Deque");
            System.out.println("10. Get the length of the Deque ");
            System.out.println("11. Clear the Deque");
            System.out.println("12. Quit");

            option = Integer.parseInt(input.nextLine());



            switch (option) {
                case 1:
                    System.out.println("What integer to enqueue to the end of the Deque?");
                    int val = Integer.parseInt(input.nextLine());
                    q.enqueue(val);
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;

                case 2:
                    System.out.println("What integer to inject to the front of the Deque?");
                    val = Integer.parseInt(input.nextLine());
                    q.inject(val);
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;

                case 3:
                    if (q.length() == 0) {
                        System.out.println("Deque is empty!");
                    }
                    else if (q.length() == 100) {
                        System.out.println("Deque is full!");
                    }
                    else {

                        val = q.dequeue();
                        System.out.println("Integer at the front: " + val);
                    }
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;

                case 4:
                    if (q.length() == 0) {
                        System.out.println("Deque is empty!");
                    }
                    else if (q.length() == 100) {
                        System.out.println("Deque is full!");
                    }
                    else{
                        val = q.removeLast();
                        System.out.println("Integer at the end: " + val);
                    }
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());

                    break;

                case 5:
                    if (q.length() == 0) {
                        System.out.println("Deque is empty!");
                    }
                    else if (q.length() == 100) {
                        System.out.println("Deque is full!");
                    }
                    else {

                        val = q.peek();
                        System.out.println("Peek: " + val);
                    }
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;

                case 6:
                    if (q.length() == 0) {
                        System.out.println("Deque is empty!");
                    }
                    else if (q.length() == 100) {
                        System.out.println("Deque is full!");
                    }
                    else {

                        val = q.endOfDeque();
                        System.out.println("EndOfDeque: " + val);
                    }
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;

                case 7:
                    System.out.println("What integer to insert to the Deque?");
                     val = Integer.parseInt(input.nextLine());

                    System.out.println("What position to insert in?");
                    int pos = Integer.parseInt(input.nextLine());

                    if (pos < 1 || pos > q.length() + 1) {
                        while (true) {
                            System.out.println("Not a valid position in the Deque!");
                            System.out.println("What position to insert in?");
                            pos = Integer.parseInt(input.nextLine());
                            if (pos >= 1 && pos <= q.length() + 1) {
                                break;
                            }
                        }
                    }

                    q.insert(val, pos);
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;

                case 8:
                    if (q.length() == 0) {
                        System.out.println("Deque is empty!");
                    }
                    else if (q.length() == 100) {
                        System.out.println("Deque is full!");
                    }
                    else {
                    System.out.println("What position to remove from the Deque?");
                    pos = Integer.parseInt(input.nextLine());
                    while (pos < 1 || pos > q.length()) {
                        System.out.println("Not a valid position in the Deque!");
                        System.out.println("What position to remove from the Deque?");
                        pos = Integer.parseInt(input.nextLine());
                    }
                    if (pos >= 1 && pos <= q.length()) {
                        val = q.remove(pos);
                        System.out.println(val + " was at position " + pos + " in the Deque.");
                    }}
                        System.out.println("Deque is: ");
                        System.out.println(q.toString());

                    break;

                case 9:
                    if (q.length() == 0) {
                        System.out.println("Deque is empty!");
                    }
                    else if (q.length() == 100) {
                        System.out.println("Deque is full!");
                    }
                    else {
                        System.out.println("What position to get from the Deque?");
                        pos = Integer.parseInt(input.nextLine());

                        while (pos < 1 || pos > q.length()) {
                            System.out.println("Not a valid position in the Deque!");
                            System.out.println("What position to get from the Deque?");
                            pos = Integer.parseInt(input.nextLine());
                            break;
                        }
                        val = q.get(pos);
                        System.out.println(val + " is at position " + pos + " in the Deque.");
                    }
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;


                case 10:
                    if (q.length() == 0) {
                        System.out.println("Deque is empty!");
                    }
                    else if (q.length() == 100) {
                        System.out.println("Deque is full!");
                    }
                    else {
                        System.out.println("Length of the deque: " + q.length());
                    }
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;

                case 11:
                    q.clear();

                    System.out.println("Deque is now empty!");
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());

                    break;

                case 12:
                    break;

                default:
                    System.out.println("Not a valid option!");
                    System.out.println("Deque is: ");
                    System.out.println(q.toString());
                    break;
            }

            System.out.println();
        } while (option != 12);
    }
}