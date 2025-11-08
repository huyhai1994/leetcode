package get_smallest_larget;

import org.junit.jupiter.api.Test;

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


}