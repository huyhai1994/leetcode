package migratory_bird;

import java.util.*;
import java.util.stream.Collectors;

public class Result {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birds =
                arr.stream()
                .collect(
                        Collectors.toMap(
                                bird -> bird,
                                bird -> 1,
                                Integer::sum,
                                LinkedHashMap::new
                        )
                );
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> bird : birds.entrySet()) {
            int frequency = bird.getValue();
            maxValue = Math.max(maxValue, frequency);
        }
        final int maxFrequencies = maxValue;
        Optional<Integer> bird = birds.entrySet()
                .stream()
                .filter(item -> item.getValue().equals(maxFrequencies))
                .map(Map.Entry::getKey)
                .findFirst();
        return bird.orElse(0);
    }
}
