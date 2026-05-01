package multithread.countdownlatch;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


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

    }

}