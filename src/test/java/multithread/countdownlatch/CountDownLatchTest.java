package multithread.countdownlatch;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CountDownLatchTest {

    @Test
    public void LatchExample() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            new Thread(
                    () -> {
                        System.out.println(Thread.currentThread().getName() + " is working");
                        try {
                            if (Thread.currentThread().getName().equals("Thread-1"))
                                throw new RuntimeException("Thread 1 dead");
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println(Thread.currentThread().getName() + " finished. Count: " + countDownLatch.getCount());
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        } catch (Exception e) {
                            System.out.println("[CountDownLatch] - Thread: " + e.getMessage() + " with name" + Thread.currentThread().getName());
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
            ).start();

        }
        System.out.println("Main Thread waits for all workers to finish");
        countDownLatch.await();
        System.out.println("All workers finished! Main thread proceeds");
        assertEquals(0, countDownLatch.getCount());
    }

    @Test
    public void allThreadsStartAtSameTime() throws InterruptedException {
        int numberOfThreads = 5;
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch endSignal = new CountDownLatch(numberOfThreads);
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        try {
            for (int i = 0; i < numberOfThreads; i++) {
                executorService.submit(() -> {
                    try {
                        startSignal.await();
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        endSignal.countDown();
                    }
                });

            }
        } finally {
            executorService.shutdown();
        }
        startSignal.countDown();
        endSignal.await();
        assertAll(
                () -> assertEquals(0, endSignal.getCount()),
                () -> assertEquals(0, startSignal.getCount())
        );


    }

}