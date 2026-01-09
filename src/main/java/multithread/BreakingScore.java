package multithread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BreakingScore {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        AtomicInteger high = new AtomicInteger(scores.get(0));
        AtomicInteger low = new AtomicInteger(scores.get(0));
        AtomicInteger breaksHigh = new AtomicInteger(0);
        AtomicInteger breaksLow = new AtomicInteger(0);

        scores.parallelStream().skip(1).forEach(score -> {
            int currentHigh = high.get();
            int currentLow = low.get();
            if (score > currentHigh) {
                while (!high.compareAndSet(currentHigh, score)) {
                    currentHigh = high.get();
                    if (score <= currentHigh) break;
                }
                if (score > currentHigh) breaksHigh.incrementAndGet();
            }
            // Same pattern for low
            if (score < currentLow) {
                while (!low.compareAndSet(currentLow, score)) {
                    currentLow = low.get();
                    if (score >= currentLow) break;
                }
                if (score < currentLow) breaksLow.incrementAndGet();
            }
        });

        return Arrays.asList(breaksHigh.get(), breaksLow.get());
    }

}
