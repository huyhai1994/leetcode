package multithread.headfirst.lost_update;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class LostUpdate {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(6);

        Balance balance = new Balance();
        for (int i = 0; i < 1000; i++) {
            pool.execute(balance::increment);
        }
        pool.shutdown();
        if (pool.awaitTermination(1, TimeUnit.SECONDS)) {
            log.info("balance  = {}", balance.balanceValue);
        }
    }

    private static class Balance {
        int balanceValue = 0;

        public void increment() {
            balanceValue++;
        }
    }
}
