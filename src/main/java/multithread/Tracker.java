package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Tracker {
    public static void main(String[] args) {
        Counter counterObj = new Counter();
        int NUMBER_OF_THREAD = 10;
        ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_THREAD);
        for (int i = 0; i < NUMBER_OF_THREAD; i++) {
            int finalI = i;
            executor.submit(() -> {
                new CounterThread(counterObj, "Thread " + finalI);
            });
        }
        executor.shutdown();
        try {
            if (executor.awaitTermination(2, TimeUnit.MINUTES)) {
                System.out.println("final count result ->> " + counterObj.getCurrentCounter());
            } else {
                System.out.println("Tasks did not complete in time");
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted while waiting");
        }
    }
}

