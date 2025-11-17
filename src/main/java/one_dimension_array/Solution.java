package one_dimension_array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            a[i] = value;
        }
        scan.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
