package multithread.threadpoolexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        AtomicInteger counter = new AtomicInteger();
        for (int i = 0; i < 10; i++) {
            executor.execute(counter::incrementAndGet);
        }
        executor.shutdown();
        boolean finished;
        try {
            finished = executor.awaitTermination(1000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (finished) System.out.println(counter);
    }
}
