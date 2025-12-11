package prime_checker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Solution sol = new Solution();
        List<Integer> listToCheck = new ArrayList<>();

        // Read all integers from input
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int value;
            while ((value = br.read()) != -1) {
                if (value >= '0' && value <= '9') {      // ensure it's a digit
                    listToCheck.add(value - '0');       // convert char -> int
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        StringBuilder output = new StringBuilder();

        // Process each number
        listToCheck.forEach(item -> {

            if (item < 2) {
                output.append("0\n");
                return;
            }

            int count = 0;
            for (int i = 2; i < item; i++) {
                if (sol.checkPrime(i)) {
                    count++;
                }
            }
            output.append(count).append("\n");
        });

        System.out.print(output.toString());
    }

    // Prime check function
    public boolean checkPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
