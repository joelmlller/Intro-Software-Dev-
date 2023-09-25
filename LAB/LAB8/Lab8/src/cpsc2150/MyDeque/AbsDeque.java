/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 6
 * Due: 2/24/23
 */

package cpsc2150.MyDeque;

public abstract class AbsDeque <T> implements IDeque <T>{

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