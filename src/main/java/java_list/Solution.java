package java_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        sc.nextLine(); // consume leftover newline

        String query = sc.nextLine(); // read "Insert" or "Delete"

        if ("Insert".equals(query)) {
            int index = sc.nextInt();
            int newItem = sc.nextInt();
            list.add(index, newItem);
        } else if ("Delete".equals(query)) {
            int index = sc.nextInt();
            list.remove(index);
        }

        System.out.println(list);
    }


}
