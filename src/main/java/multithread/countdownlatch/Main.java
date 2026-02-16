package multithread.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        new Thread(
                Main.task(latch)
        ).start();
        new Thread(
                Main.task(latch)
        ).start();
        boolean isFinished;
        try {
            isFinished = latch.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (isFinished) System.out.println("All task finished!!!");
        else System.out.println("Not all task finished!!!");

    }

    public static Runnable task(CountDownLatch latch) {
        return () -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task  done!");
            latch.countDown();
        };
    }
}
