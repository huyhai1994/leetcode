package get_money_spent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void caseReverseOneItem() {
        int[] expected = new int[]{1};
        int[] input = new int[]{1};
        Solution.reverse(input);
        assertTrue(Arrays.equals(expected, input));
    }

    @Test
    void caseReverseTwoItem() {
        int[] expected = new int[]{2, 1};
        int[] input = new int[]{1, 2};
        Solution.reverse(input);
        assertTrue(Arrays.equals(expected, input));
    }

    @Test
    void caseReverseThreeItem() {
        int[] expected = new int[]{3, 2, 1};
        int[] input = new int[]{1, 2, 3};
        Solution.reverse(input);
        assertTrue(Arrays.equals(expected, input));
    }

    @Test
    void caseReverseFourItem() {
        int[] expected = new int[]{4, 3, 2, 1};
        int[] input = new int[]{1, 2, 3, 4};
        Solution.reverse(input);
        assertTrue(Arrays.equals(expected, input));
    }

    @Test
    void caseGetMoneySpent() {
        int[] keyboards = new int[]{40, 50, 60};
        int[] drives = new int[]{5, 8, 12};
        int budget = 60;
        assertEquals(58, Solution.getMoneySpent(keyboards, drives, budget));
    }
}