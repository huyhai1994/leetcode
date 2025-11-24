package java_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int item;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            item = sc.nextInt();
            list.add(item);
        }
        System.out.println(list);

    }


}
