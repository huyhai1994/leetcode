package get_smallest_larget;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        if (s == null) throw new RuntimeException("String must be not null");
        if (s.isEmpty() || k <= 0 || s.length() <= k) throw new RuntimeException("bad request");
        String largest = "";
        String smallest = "";

        smallest = s.substring(1, 2);
        largest = s.substring(0, 1);

        return smallest + "\n" + largest;

    }
}
