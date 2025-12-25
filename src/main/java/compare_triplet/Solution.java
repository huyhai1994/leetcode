package compare_triplet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = (int) IntStream.range(0, a.size())
                .filter(i -> a.get(i) > b.get(i))
                .count();
        int bobScore = (int) IntStream.range(0, b.size())
                .filter(i -> a.get(i) < b.get(i))
                .count();
        return Arrays.asList(aliceScore, bobScore);
    }
}
