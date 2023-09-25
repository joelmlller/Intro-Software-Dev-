 /* CPSC 2150 - LAB 10
  * Joel Miller / Austin Wagner
  * Lab 10
  * March 28, 2023
  */


 package cpsc2150.listDec;

import java.util.List;
import java.util.Random;


 /**
  * The IShuffleList interface represents a list that can be shuffled and have its elements swapped.
  *
  * @param <T> The type of elements in the list.
  *
  * @pre The list has been instantiated.
  *
  * @post The list can be shuffled and have its elements swapped.
  *
  */
public interface IShuffleList<T> extends List<T> {


    /**
     * Randomly picks two positions in the list and swaps them.
     *
     * @param swaps The number of swaps to perform.
     *
     * @pre swaps {@code >=} 0
     *
     * @post The list has been shuffled swaps times.
     */
    default void shuffle(int swaps){
        Random rand = new Random();
        int rand_num1 = rand.nextInt(size());
        int rand_num2 = rand.nextInt(size());

        T pos1;
        T pos2;

        for (int i = 0; i < swaps; i++){

        pos1 = get(rand_num1);
        pos2 = get(rand_num2);

        set(rand_num1, pos2);
        set(rand_num2, pos1);

        rand_num1 = rand.nextInt(size());
        rand_num2 = rand.nextInt(size());

        }
    }

    /**
     * Exchanges the values at positions i and j in the list.
     *
     * @param i The index of the first element to swap.
     * @param j The index of the second element to swap.
     *
     * @pre 0 {@code <=} i {@code <} size()
     *  and 0 {@code <=} j {@code <} size()
     *
     * @post The elements at positions i and j have been swapped.
     */
    default void swap(int i, int j){

        T pos1;
        T pos2;

        pos1 = get(i);
        pos2 = get(i);

        set(i, pos2);
        set(j, pos1);

    }

}
