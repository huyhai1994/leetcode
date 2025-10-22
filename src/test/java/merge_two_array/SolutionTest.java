package merge_two_array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void case1() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void case2() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void case3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        assertArrayEquals(new int[]{1}, nums1);
    }

}