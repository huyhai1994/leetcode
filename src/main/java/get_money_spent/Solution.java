package get_money_spent;

public class Solution {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        return 1;
    }

    static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
