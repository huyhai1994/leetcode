package two_dimension_array;

import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public int sumHourGlass(List<List<Integer>> inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = inputArray.get(i).get(j) + inputArray.get(i).get(j + 1) + inputArray.get(i).get(j + 2)
                        + inputArray.get(i + 1).get(j + 1)
                        + inputArray.get(i + 2).get(j) + inputArray.get(i + 2).get(j + 1) + inputArray.get(i + 2).get(j + 2);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
