/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 5
 * Due: 2/17/23
 */


package cpsc2150.MyDeque;


import java.util.ArrayDeque;

public abstract class AbsDeque implements IDeque {

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("<");
        for (int i = 1; i <= length(); i++) {

            sb.append(get(i));

            if (i != length()) {
                sb.append(", ");
            }
        }
        sb.append(">");

        return sb.toString();
    }
}