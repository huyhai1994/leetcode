package multithread.callable;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            TimeUnit.SECONDS.sleep(1);
            return "task done";
        };
        Future<String> future = executorService.submit(task);
        try {
            String result = future.get();
            log.info(result);
        } catch (InterruptedException | ExecutionException e) {
            log.error("something went wrong!");
            throw new RuntimeException(e.getMessage());
        }

        executorService.shutdown();
    }
}
