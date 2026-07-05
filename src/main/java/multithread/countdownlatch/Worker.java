package multithread.countdownlatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Worker implements Runnable {

    private final int workerId;
    private final CountDownLatch ready;
    private final CountDownLatch start;
    private final CountDownLatch done;

    public Worker(int workerId, CountDownLatch ready, CountDownLatch start, CountDownLatch done) {
        this.workerId = workerId;
        this.ready = ready;
        this.start = start;
        this.done = done;
    }

    @Override
    public void run() {
        try {
            log.info("Worker {} is preparing...", workerId);
            TimeUnit.SECONDS.sleep(1);

            log.info("Worker {} is ready.", workerId);
            ready.countDown();

            log.info("Worker {} is waiting for start signal.", workerId);
            start.await();

            log.info("Worker {} started working.", workerId);
            TimeUnit.SECONDS.sleep(3);

            log.info("Worker {} finished working.", workerId);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.warn("Worker {} was interrupted.", workerId);
        } finally {
            done.countDown();
        }
    }
}