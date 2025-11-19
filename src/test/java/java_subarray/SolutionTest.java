package java_subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void caseOneItemWithOneNegativeCountArray() {
        int[] array = new int[]{-1};
        assertEquals(1, Solution.count(array, 0, 0, 0));
    }

    @Test
    void caseOneItemWitNonNegativeCountArray() {
        int[] array = new int[]{1};
        assertEquals(0, Solution.count(array, 0, 0, 0));
    }

    @Test
    void caseTwoItemWitNonNegativeCountArray() {
        int[] array = new int[]{1, 2};
        assertEquals(0, Solution.count(array, 0, 0, 0));
    }

    @Test
    void caseTwoItemWithOneNegativeCountArray() {
        int[] array = new int[]{3, -2};
        assertEquals(1, Solution.count(array, 0, 0, 0));
    }

    @Test
    void caseTwoItemWithTwoNegativeCountArray() {
        int[] array = new int[]{1, -2};
        assertEquals(2, Solution.count(array, 0, 0, 0));
    }

    @Test
    void caseTwoItemWitThreeNegativeCountArray() {
        int[] array = new int[]{-1, -2};
        assertEquals(3, Solution.count(array, 0, 0, 0));
    }

    @Test
    void caseThreeItemWithZeroNegativeCount() {
        int[] array = new int[]{1, 2, 3};
        assertEquals(0, Solution.count(array, 0, 0, 0));
    }

    @Test
    void caseThreeItemWithOneNegativeItem() {
        int[] array1 = new int[]{-1, 2, 3};
        int[] array2 = new int[]{1, -2, 3};
        int[] array3 = new int[]{1, 2, -3};
        assertEquals(1, Solution.count(array1, 0, 0, 0));
        assertEquals(2, Solution.count(array2, 0, 0, 0));
        assertEquals(2, Solution.count(array3, 0, 0, 0));
    }
}