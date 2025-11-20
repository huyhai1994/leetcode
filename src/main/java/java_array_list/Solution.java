package java_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d;
        int q;
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            StringBuilder printOutPut = new StringBuilder(d + " ");
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                q = sc.nextInt();
                array.add(q);
                printOutPut.append(q).append(" ");
            }
            System.out.println(printOutPut);
            arrayList.add(array);
        }
        System.out.println(arrayList);
    }
}
