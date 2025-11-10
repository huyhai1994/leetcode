package get_smallest_larget;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        if (s == null) throw new RuntimeException("String must be not null");
        if (s.isEmpty() || k <= 0 || s.length() <= k) throw new RuntimeException("bad request");
        String largest = "";
        String smallest = "";


        List<String> dummyListString = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            dummyListString.add(s.substring(i, i + k));
        }
        List<String> sortedList = dummyListString.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        smallest = sortedList.get(0);
        largest = sortedList.get(dummyListString.size() - 1);
        return smallest + "\n" + largest;

    }
}
