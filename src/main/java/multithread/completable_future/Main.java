package multithread.completable_future;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class Main {
    private static final long SLEEP_TIME = 10;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                try {
                    TimeUnit.SECONDS.sleep(SLEEP_TIME);
                    return "task done";
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }, executorService).exceptionally(
                    ex -> {
                        log.error("Something went wrong {}", ex.getMessage());
                        return "fallback value";
                    }
            );
            String result = future.join();
            log.info(result);
        } finally {
            executorService.shutdown();
            try {
                if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException e) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }


    }
}
