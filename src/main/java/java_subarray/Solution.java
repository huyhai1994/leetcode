package java_subarray;

public class Solution {
    static int count(int[] arr, int start, int end, int sum) {

        if (start == arr.length) return 0;

        if (end == arr.length)
            return count(arr, start + 1, start + 1, 0);

        sum += arr[end];

        int negative = (sum < 0) ? 1 : 0;

        return negative + count(arr, start, end + 1, sum);
    }
}
