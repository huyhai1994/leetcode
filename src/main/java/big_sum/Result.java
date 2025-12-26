package big_sum;

import java.util.List;

public class Result {
    public static long aVeryBigSum(List<Long> ar) {
        return ar.parallelStream().reduce(0L, Long::sum);
    }
}
