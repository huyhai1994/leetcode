package multithread.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        new Thread(
                () -> {
                    System.out.println("Task 1 done!");
                    latch.countDown();
                }
        ).start();
        new Thread(
                () -> {
                    try {
                        TimeUnit.SECONDS.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Task 2 done!");
                    latch.countDown();
                }
        ).start();
        boolean isFinished;
        try {
            isFinished = latch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (isFinished) System.out.println("All task finished!!!");
        else System.out.println("Not all task finished!!!");

    }
}
