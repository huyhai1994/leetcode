package validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), 1);
        }
        return Objects.equals(map.get('('), map.get(')'));
    }
}
