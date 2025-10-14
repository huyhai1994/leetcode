package search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return nums[nums.length - 1] < target ? nums.length : 0;
    }
}
