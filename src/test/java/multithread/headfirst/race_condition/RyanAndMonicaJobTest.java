package multithread.headfirst.race_condition;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class RyanAndMonicaJobTest {
    @Test
    void ryan_and_monica_should_fight_for_same_resource() throws InterruptedException {
        BankAccount account = new BankAccount();
        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(ryan);
        executorService.execute(monica);
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        assertEquals(0, account.getBalance());
    }

}