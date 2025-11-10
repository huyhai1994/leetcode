package anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) return false;

        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();
        for (char c : a.toCharArray()) {
            mapA.put(String.valueOf(c), mapA.getOrDefault(String.valueOf(c), 0) + 1);
        }
        for (char c : b.toCharArray()) {
            mapB.put(String.valueOf(c), mapB.getOrDefault(String.valueOf(c), 0) + 1);
        }
        return mapA.equals(mapB);
    }
}
