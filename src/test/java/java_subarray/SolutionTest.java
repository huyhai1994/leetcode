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
    void caseTwoItemWithOneNegativeCountArray() {
        int[] array = new int[]{3, -2};
        assertEquals(1, Solution.printNegativeSumOfSubarray(array));
    }

    @Test
    void caseTwoItemWithTwoNegativeCountArray() {
        int[] array = new int[]{1, -2};
        assertEquals(2, Solution.printNegativeSumOfSubarray(array));
    }

    @Test
    void caseTwoItemWitThreeNegativeCountArray() {
        int[] array = new int[]{-1, -2};
        assertEquals(3, Solution.printNegativeSumOfSubarray(array));
    }

//    @Test
//    void caseThreeItemWithFourNegativeCount() {
//        int[] array = new int[]{-1, -2, -3 - 4};
//        assertEquals(3, Solution.printNegativeSumOfSubarray(array));
//    }
}