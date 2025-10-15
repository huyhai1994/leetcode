package plus_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void case1() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        Solution solution = new Solution();
        assertArrayEquals(expected, solution.plusOne(input));
    }

    @Test
    public void case2() {
        int[] input = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        Solution solution = new Solution();
        assertArrayEquals(expected, solution.plusOne(input));
    }

    @Test
    public void case3() {
        int[] input = {9};
        int[] expected = {1, 0};
        Solution solution = new Solution();
        assertArrayEquals(expected, solution.plusOne(input));
    }

    @Test
    public void case4() {
        int[] input = new int[]{999};
        int[] expected = new int[]{1, 0, 0, 0};
        Solution solution = new Solution();
        assertArrayEquals(expected, solution.plusOne(input));
    }
}