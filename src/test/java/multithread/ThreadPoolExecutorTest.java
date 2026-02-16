package multithread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorTest {

    @Test
    public void testMultipleRequestsWithRejectionHandler() throws InterruptedException {
        // Create executor with small capacity to trigger rejections
        AtomicInteger rejectedCount = new AtomicInteger(0);
        AtomicInteger executedCount = new AtomicInteger(0);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                                    // corePoolSize
                2,                                    // maximumPoolSize (small to trigger rejections)
                60L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2),         // small queue capacity
                new ThreadPoolExecutor.AbortPolicy()  // throws exception on rejection
        );

        // Submit 10 tasks rapidly
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            try {
                executor.execute(() -> {
                    executedCount.incrementAndGet();
                    System.out.println("Task " + taskId + " executed by: " +
                            Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000); // Simulate work
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            } catch (RejectedExecutionException e) {
                rejectedCount.incrementAndGet();
                System.out.println("Task " + taskId + " REJECTED");
            }
        }

        executor.shutdown();
        boolean terminated = executor.awaitTermination(30, TimeUnit.SECONDS);

        System.out.println("\n=== Results ===");
        System.out.println("Executed: " + executedCount.get());
        System.out.println("Rejected: " + rejectedCount.get());
        System.out.println("Terminated: " + terminated);
    }

    @Test
    public void testWithCustomRejectionPolicy() throws InterruptedException {
        AtomicInteger discardedCount = new AtomicInteger(0);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1,
                1,
                60L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1),
                new ThreadPoolExecutor.DiscardPolicy() // silently discards rejected tasks
        );

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " executed");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    @Test
    public void testCallerRunsPolicy() throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1,
                1,
                60L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1),
                new ThreadPoolExecutor.CallerRunsPolicy() // main thread executes rejected tasks
        );

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " executed by: " +
                        Thread.currentThread().getName());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
    }
}