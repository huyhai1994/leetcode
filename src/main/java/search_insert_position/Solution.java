package search_insert_position;

import java.util.stream.IntStream;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return IntStream
                .range(0, nums.length)
                .filter(i -> nums[i] >= target)
                .findFirst()
                .orElse(nums.length);

    }
}
