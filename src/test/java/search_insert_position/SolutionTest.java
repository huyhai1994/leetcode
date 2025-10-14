package search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void case1() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        assertEquals(2, solution.searchInsert(nums, target));
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        assertEquals(1, solution.searchInsert(nums, target));
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        assertEquals(4, solution.searchInsert(nums, target));
    }

    @Test
    public void case4() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        assertEquals(0, solution.searchInsert(nums, target));
    }
}