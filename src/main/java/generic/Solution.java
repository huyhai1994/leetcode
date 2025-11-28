package generic;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthIntArray = sc.nextInt();
        Integer[] intArray = new Integer[lengthIntArray];
        for (int i = 0; i < lengthIntArray; i++) {
            intArray[i] = sc.nextInt();
        }
        sc.nextLine();
        int lengthStringArray = sc.nextInt();
        sc.nextLine();
        String[] stringArray = new String[lengthStringArray];
        for (int i = 0; i < lengthStringArray; i++) {
            stringArray[i] = sc.nextLine();
        }
        Solution sol = new Solution();
        sol.printHelper(intArray);
        sol.printHelper(stringArray);
    }

    public <T> void printHelper(T[] inputArray) {
        for (T item : inputArray) {
            System.out.println(item);
        }
    }
}
