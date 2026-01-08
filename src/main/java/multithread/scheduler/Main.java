package multithread.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(
                () -> {
                    try {
                        if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                            scheduler.shutdownNow();
                        }
                    } catch (InterruptedException e) {
                        scheduler.shutdownNow();
                    }
                }
        ));
        scheduler.scheduleAtFixedRate(new MyRunnable(), 0, 1, TimeUnit.SECONDS);
    }


}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello there");
    }
}
