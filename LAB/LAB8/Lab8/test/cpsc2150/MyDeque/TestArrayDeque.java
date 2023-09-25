/* Austin Wagner & Joel Miller
 * CPSC 2151
 * Lab 8
 * Due: 3/07/23
 */

package cpsc2150.MyDeque;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class TestArrayDeque {
    private IDeque<Integer> MakeADeque() {
        return new ArrayDeque<>();
    }

    // Enqueue tests
    @Test
    public void test_enqueue_5_10() {
        // Declare and initialize input vars
        int input1 = 5;
        int input2 = 10;
        // Declare and initialize expected output
        String expected = "<5, 10>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();

        // Run method and get output
        test1.enqueue(input1);
        test1.enqueue(input2);
        String actual = test1.toString();

        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_enqueue_neg10_0_4() {
        // Declare and initialize input vars
        int input1 = -10;
        int input2 = 0;
        int input3 = 4;
        // Declare and initialize expected output
        String expected = "<-10, 0, 4>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_enqueue_4532532() {
        // Declare and initialize input vars
        int input1 = 4532532;
        // Declare and initialize expected output
        String expected = "<4532532>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }


    // Dequeue tests
    @Test
    public void test_dequeue_4_5_3() {
        // Declare and initialize input vars
        int input1 = 4;
        int input2 = 5;
        int input3 = 3;
        // Declare and initialize expected output
        String expected = "<5, 3>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        //enqueues the integers
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        test1.dequeue();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    // Dequeue tests
    @Test
    public void test_dequeue_5_4_7_3_8() {
        // Declare and initialize input vars
        int input1 = 5;
        int input2 = 4;
        int input3 = 7;
        int input4 = 3;
        int input5 = 8;
        // Declare and initialize expected output
        String expected = "<4, 7, 3, 8>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        //enques the integers
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        test1.enqueue(input4);
        test1.enqueue(input5);
        // Run method and get output
        test1.dequeue();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    // Dequeue tests
    @Test
    public void test_dequeue_765() {
        // Declare and initialize input vars
        int input1 = 3;
        int input2 = 7;
        int input3 = 6;
        int input4 = 5;
        // Declare and initialize expected output
        String expected = "<7, 6, 5>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        test1.enqueue(input4);
        // Run method and get output
        test1.dequeue();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }


    // Inject tests
    @Test
    public void test_inject_43() {
        // Declare and initialize input vars
        int input1 = 43;
        // Declare and initialize expected output
        String expected = "<43>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.inject(input1);
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_inject_neg100_4() {
        // Declare and initialize input vars
        int input1 = -100;
        int input2 = 4;
        // Declare and initialize expected output
        String expected = "<4, -100>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.inject(input1);
        test1.inject(input2);
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_inject_0_1_2() {
        // Declare and initialize input vars
        int input1 = 0;
        int input2 = 1;
        int input3 = 2;
        // Declare and initialize expected output
        String expected = "<2, 1, 0>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.inject(input1);
        test1.inject(input2);
        test1.inject(input3);
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    // Test removeLast
    @Test
    public void test_removeLast_0_1_2() {
        // Declare and initialize input vars
        int input1 = 0;
        int input2 = 1;
        int input3 = 2;
        // Declare and initialize expected output
        String expected = "<0, 1>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        test1.removeLast();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_removeLast_4() {
        // Declare and initialize input vars
        int input1 = 4;
        // Declare and initialize expected output
        String expected = "<>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        test1.removeLast();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_removeLast_neg7_4_9_43() {
        // Declare and initialize input vars
        int input1 = -7;
        int input2 = 4;
        int input3 = 9;
        int input4 = 43;
        // Declare and initialize expected output
        String expected = "<-7, 4>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        test1.enqueue(input4);
        test1.removeLast();
        test1.removeLast();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    // Test clear
    @Test
    public void test_clear_4_5_3_3_3() {
        // Declare and initialize input vars
        int input1 = 4;
        int input2 = 5;
        int input3 = 3;
        int input4 = 3;
        int input5 = 3;
        // Declare and initialize expected output
        String expected = "<>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        test1.clear();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_clear_4_5_3_2_7() {
        // Declare and initialize input vars
        int input1 = 4;
        int input2 = 5;
        int input3 = 3;
        int input4 = 2;
        int input5 = 7;
        // Declare and initialize expected output
        String expected = "<>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        test1.clear();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }

    @Test
    public void test_clear_4_5_3() {
        // Declare and initialize input vars
        int input1 = 4;
        int input2 = 5;
        int input3 = 3;
        // Declare and initialize expected output
        String expected = "<>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        test1.clear();
        String actual = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
    }
    //test peek method
    @Test
    public void test_peek_4_5_3() {
        // Declare and initialize input vars
        int input1 = 4;
        int input2 = 5;
        int input3 = 3;
        // Declare and initialize expected output
        int expected = 4;
        String expectedStr = "<4, 5, 3>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        int actual = test1.peek();
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }
    @Test
    public void test_peek_6_5_2() {
        // Declare and initialize input vars
        int input1 = 6;
        int input2 = 5;
        int input3 = 2;
        // Declare and initialize expected output
        int expected = 6;
        String expectedStr = "<6, 5, 2>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        int actual = test1.peek();
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }
    @Test
    public void test_peek_5_3_7() {
        // Declare and initialize input vars
        int input1 = 5;
        int input2 = 3;
        int input3 = 7;
        // Declare and initialize expected output
        int expected = 5;
        String expectedStr = "<5, 3, 7>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        int actual = test1.peek();
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }
    //test end of dequeue method
    @Test
    public void test_endofdequeue_1_3_7() {
        // Declare and initialize input vars
        int input1 = 1;
        int input2 = 3;
        int input3 = 7;
        // Declare and initialize expected output
        int expected = 7;
        String expectedStr = "<1, 3, 7>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        int actual = test1.endOfDeque();
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }
    @Test
    public void test_endofdequeue_5_3_4() {
        // Declare and initialize input vars
        int input1 = 5;
        int input2 = 3;
        int input3 = 4;
        // Declare and initialize expected output
        int expected = 4;
        String expectedStr = "<5, 3, 4>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        int actual = test1.endOfDeque();
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }
    @Test
    public void test_endofdequeue_03() {
        // Declare and initialize input vars
        int input1 = 5;
        int input2 = 3;
        int input3 = 2;
        // Declare and initialize expected output
        int expected = 2;
        String expectedStr = "<5, 3, 2>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        // Run method and get output
        int actual = test1.endOfDeque();
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }
//Test insert method
    @Test
    public void test_insert_3_3_2_2() {
        // Declare and initialize input vars
        int input1 = 3;
        int input2 = 3;
        int input3 = 2;
        int input4 = 2;
        // Declare and initialize expected output
        String expectedStr = "<3, 2, 3>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.insert(input3, input4);
        // Run method and get output
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void test_insert_3_1() {
        // Declare and initialize input vars
        int input1 = 3;
        int input2 = 1;
        // Declare and initialize expected output
        String expectedStr = "<3>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.insert(input1, input2);
        // Run method and get output
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expectedStr, actualStr);
    }
    @Test
    public void test_insert_3_3_3_3() {
        // Declare and initialize input vars
        int input1 = 3;
        int input2 = 3;
        int input3 = 3;
        int input4 = 3;

        String expectedStr = "<3, 3, 3>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.insert(input3, input4);
        // Run method and get output
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expectedStr, actualStr);
    }

    // Test remove method
    @Test
    public void test_remove_10_1() {
        // Declare and initialize input vars
        int input1 = 10;
        int input2 = 1;
        // Declare and initialize expected output
        int expected = 10;
        String expectedStr = "<>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        int actual = test1.remove(input2);
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void test_remove_4_3_2_2() {
        // Declare and initialize input vars
        int input1 = 4;
        int input2 = 3;
        int input3 = 2;
        int input4 = 2;
        // Declare and initialize expected output
        int expected = 3;
        String expectedStr = "<4, 2>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        int actual = test1.remove(input4);
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void test_remove_10_1_4() {
        // Declare and initialize input vars
        int input1 = 10;
        int input2 = 1;
        int input3 = 4;
        // Declare and initialize expected output
        int expected = 10;
        String expectedStr = "<4>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        int actual = test1.remove(input2);
        test1.enqueue(input3);
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }


    // Test get method
    @Test
    public void test_get_0_2_1() {
        // Declare and initialize input vars
        int input1 = 0;
        int input2 = 2;
        int input3 = 1;
        // Declare and initialize expected output
        int expected = 0;
        String expectedStr = "<0, 2>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        test1.enqueue(input2);
        int actual = test1.get(input3);
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void test_get_0_2_3_3() {
        // Declare and initialize input vars
        int input1 = 0;
        int input2 = 2;
        int input3 = 3;
        int input4 = 3;
        // Declare and initialize expected output
        int expected = 3;
        String expectedStr = "<0, 2, 3>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        test1.enqueue(input2);
        test1.enqueue(input3);
        int actual = test1.get(input4);
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void test_get_neg10_1() {
        // Declare and initialize input vars
        int input1 = -10;
        int input2 = 1;
        // Declare and initialize expected output
        int expected = -10;
        String expectedStr = "<-10>";
        // Declare Object and set up space
        IDeque<Integer> test1 = MakeADeque();
        // Run method and get output
        test1.enqueue(input1);
        int actual = test1.get(input2);
        String actualStr = test1.toString();
        // Compare expected and actual
        assertEquals(expected, actual);
        assertEquals(expectedStr, actualStr);
    }
}
