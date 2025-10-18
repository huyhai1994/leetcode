package sqrt_x;

public class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 0;
        int right = x / 2;
        int result = 0;

        while (left <= right) {
            int guess = (left + right) / 2;
            long square = (long) guess * guess;
            if (square == x) return guess;
            if (square > x) {
                right = guess - 1;
            }
            if (square < x) {
                result = guess;
                left = guess + 1;
            }
        }
        return result;
    }
}
