package java_subarray;

public class Solution {
    public static int printNegativeSumOfSubarray(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j < 0) {
                count++;
            }
        }
        return count;
    }
}
