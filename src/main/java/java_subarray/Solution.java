package java_subarray;

public class Solution {
    public static int printNegativeSumOfSubarray(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j < 0) {
                count++;
            }
        }
        if (array.length > 1 && array[0] + array[1] < 0) {
            count++;
        }
        return count;
    }
}
