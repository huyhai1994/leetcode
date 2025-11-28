package multithread;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WorkerThread {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Worker finished");
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        });
        worker.start();
        try {
            worker.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (worker.isAlive()) {
            System.out.println("Working thread is still running!!!");
        } else {
            System.out.println("Worker finished within time out");
        }
    }
}
