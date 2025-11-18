package java_subarray;

public class Solution {
    public static int printNegativeSumOfSubarray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
