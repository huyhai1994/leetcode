package plus_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        List<Integer> list = new ArrayList<>();
        String[] numbers = sb.toString().split("");
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }

        int carry = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            int sum = list.get(i) + carry;
            list.set(i, sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            list.add(0, carry);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
