package java_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumber {
    public static int pickingNumber(List<Integer> a) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int number : a) {
            freq.put(number, freq.getOrDefault(number, 0) + 1);
        }

        int max = 0;

        for (int key : freq.keySet()) {
            int current = freq.get(key);
            int next = freq.getOrDefault(key + 1, 0);
            max = Math.max(max, current + next);
        }

        return max;
    }
}
