package multithread.scheduler;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
    private static final long PERIOD = 10;

    public static void main(String[] args) {
        new Main().createSchedulingJobs();
    }

    public void createSchedulingJobs() {

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
            try {
                if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                    scheduler.shutdownNow();
                }
            } catch (InterruptedException e) {
                scheduler.shutdownNow();
            }
        }));

        scheduler.scheduleAtFixedRate(new MyRunnable(), 0, PERIOD, TimeUnit.SECONDS);

        // Keep the main thread alive
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


class MyRunnable implements Runnable {
    private static final Object lock = new Object();

    @Override
    public void run() {
        String requestId = UUID.randomUUID().toString().replace("-", "_");
        try {
            synchronized (lock) {
                System.out.println("Hello there " + this + new Date() + requestId);
                throw new RuntimeException("error 😒");
            }
        } catch (Exception e) {
            System.err.println("Task execution failed: " + e.getMessage() + requestId);
        }
    }
}