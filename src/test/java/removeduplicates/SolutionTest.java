package removeduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void case1() {
        int[] nums = {1, 1, 2};
        Solution solution = new Solution();
        assertEquals(2, solution.removeDuplicates(nums));
    }

    @Test
    public void case2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        assertEquals(5, solution.removeDuplicates(nums));
    }

    @Test
    public void case3() {
        int[] nums = {};
        Solution solution = new Solution();
        assertEquals(0, solution.removeDuplicates(nums));
    }

    @Test
    public void case4() {
        int[] nums = {5};
        Solution solution = new Solution();
        assertEquals(1, solution.removeDuplicates(nums));
    }

    @Test
    public void case5() {
        int[] nums = {3, 3, 3};
        Solution solution = new Solution();
        assertEquals(1, solution.removeDuplicates(nums));
    }

    @Test
    public void case6() {
        int[] nums = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        assertEquals(5, solution.removeDuplicates(nums));
    }

    @Test
    public void case7() {
        int[] nums = {2, 2};
        Solution solution = new Solution();
        assertEquals(1, solution.removeDuplicates(nums));
    }

    @Test
    public void case8() {
        int[] nums = {1, 3};
        Solution solution = new Solution();
        assertEquals(2, solution.removeDuplicates(nums));
    }

    @Test
    public void case9() {
        int[] nums = {-1, 0, 1};
        Solution solution = new Solution();
        assertEquals(3, solution.removeDuplicates(nums));
    }

    @Test
    public void case10() {
        int[] nums = {-2, -2, -1, -1, 0};
        Solution solution = new Solution();
        assertEquals(3, solution.removeDuplicates(nums));
    }

    @Test
    public void case11() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution solution = new Solution();
        assertEquals(10, solution.removeDuplicates(nums));
    }

    @Test
    public void case12() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        Solution solution = new Solution();
        assertEquals(5, solution.removeDuplicates(nums));
    }
}