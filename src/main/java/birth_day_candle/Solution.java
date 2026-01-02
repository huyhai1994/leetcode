package birth_day_candle;

import java.util.List;

public class Solution {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHeight = 0;
        int count = 0;

        for (int candle : candles) {
            if (candle > maxHeight) {
                maxHeight = candle;
                count = 1;
            } else if (candle == maxHeight) {
                count++;
            }
        }

        return count;
    }
}
