package java_subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void caseOneItemWithOneNegativeCountArray() {
        int[] array = new int[]{-1};
        assertEquals(1, Solution.printNegativeSumOfSubarray(array));
    }

    @Test
    void caseOneItemWitNonNegativeCountArray() {
        int[] array = new int[]{1};
        assertEquals(0, Solution.printNegativeSumOfSubarray(array));
    }

    @Test
    void caseTwoItemWitNonNegativeCountArray() {
        int[] array = new int[]{1, 2};
        assertEquals(0, Solution.printNegativeSumOfSubarray(array));
    }

    @Test
    void caseTwoItemWitThreeNegativeCountArray() {
        int[] array = new int[]{-1, -2};
        assertEquals(3, Solution.printNegativeSumOfSubarray(array));
    }
}