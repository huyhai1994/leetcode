package java_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d, q, queryTime, x, y;
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            StringBuilder printout = new StringBuilder(d + " ");
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                q = sc.nextInt();
                array.add(q);
                printout.append(q).append(" ");
            }
            System.out.println(printout);
            arrayList.add(array);
        }

        queryTime = sc.nextInt();
        for (int i = 0; i < queryTime; i++) {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            try {
                System.out.println(arrayList.get(x).get(y));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR");
            }
        }
    }
}
