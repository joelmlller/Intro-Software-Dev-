/* Austin Wagner/ Joel Miller
 * CPSC 2151
 * Lab 4
 * Due: 2/10/23
 */

package cpsc2150.MyDeque;

import java.util.Scanner;

public class DequeApp {
    public static void main(String [] args) {
        Scanner input = new java.util.Scanner(System.in);
        IDeque q;

        int userChoice;

        do {
            System.out.println("Enter 1 for array implementation or 2 for List implementation");
            userChoice = input.nextInt();
        } while (userChoice < 1 || userChoice > 2);

        if (userChoice == 1) {
            q = new ArrayDeque();
        } else {
            q = new ListDeque();
        }

        Integer x = 3;
        q.enqueue(x);
        x = -8;
        q.enqueue(x);
        x = 15;
        q.enqueue(x);
        x = 0;
        q.enqueue(x);
        x = -4;
        q.enqueue(x);

        System.out.print("<");
        while (q.length() > 0) {
            System.out.print(q.dequeue());
            if (q.length() > 0) {
                System.out.print(", ");
            }
        }
        System.out.print(">\n");

    }

}
