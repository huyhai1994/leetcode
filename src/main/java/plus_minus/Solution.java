package plus_minus;

import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000000");
        String formatted = df.format((double) 1 / 2);
        System.out.println(formatted);
    }
}
