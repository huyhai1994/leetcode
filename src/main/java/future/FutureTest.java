package future;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class FutureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        try {
            Future<String> someFutureResult = executorService.submit(() ->
            {
                TimeUnit.SECONDS.sleep(10);
                return "some Value";

            });

            doSomeThingUseful();
            String string = someFutureResult.get();
            log.info(string);
        } finally {
            executorService.shutdown();
        }
    }

    private static void doSomeThingUseful() throws InterruptedException {
        log.info("do something useful");
        TimeUnit.SECONDS.sleep(1);
    }
}
