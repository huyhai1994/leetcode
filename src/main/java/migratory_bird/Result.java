package migratory_bird;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Result {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birds = new TreeMap<>();
        arr.forEach(bird -> {
            if (!birds.containsKey(bird)) {
                birds.put(bird, 1);
            } else {
                birds.computeIfPresent(bird, (k, v) -> v + 1);
            }
        });

        int highestFrequencyBird = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : birds.entrySet()) {
            int value = entry.getValue();
            highestFrequencyBird = Math.max(highestFrequencyBird, value);
        }

        final int maxValue = highestFrequencyBird;

        Optional<Integer> key =
                birds.entrySet()
                .parallelStream()
                .filter(entry -> entry.getValue().equals(maxValue))
                .map(Map.Entry::getKey)
                .findFirst();


        return key.orElse(0);
    }
}
