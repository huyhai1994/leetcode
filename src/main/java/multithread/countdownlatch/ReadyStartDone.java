package multithread.countdownlatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ReadyStartDone {
    public static void main(String[] args) throws InterruptedException {
        int workerCount = 3;

        CountDownLatch ready = new CountDownLatch(workerCount);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(workerCount);

        ExecutorService executorService = Executors.newFixedThreadPool(workerCount);

        for (int i = 1; i <= workerCount; i++) {
            executorService.submit(new Worker(i, ready, start, done));
        }

        log.info("Main thread is waiting for all workers to be ready...");
        ready.await();

        log.info("All workers are ready.");
        TimeUnit.SECONDS.sleep(2);

        log.info("Main thread opens the start gate.");
        start.countDown();

        log.info("Main thread is waiting for all workers to finish...");
        done.await();

        log.info("All workers finished.");

        executorService.shutdown();
    }
}
