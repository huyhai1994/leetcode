package get_smallest_larget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SolutionTest {

    @Test
    void nullString() {
        int k = 2;
        assertThrows(RuntimeException.class, () -> Solution.getSmallestAndLargest(null, k));
    }

    @Test
    void twoCharString() {
        String s = "ab";
        int k = 2;
        assertThrows(RuntimeException.class, () -> Solution.getSmallestAndLargest(s, k));
    }

    @Test
    void twoValidCharString() {
        String s = "ab";
        int k = 1;
        String expected = "b\na";
        assertEquals(expected, Solution.getSmallestAndLargest(s, k));
    }


    @Test
    void threeValidCharString() {
        String s = "abc";
        int k = 1;
        String expected = "c\na";
        assertEquals(expected, Solution.getSmallestAndLargest(s, k));
    }

    @Test
    void threeValidCharStringMixedOrder() {
        String s = "cab";
        int k = 1;
        String expected = "c\na";
        assertEquals(expected, Solution.getSmallestAndLargest(s, k));
    }

    //@TODO: k = 2 case
}