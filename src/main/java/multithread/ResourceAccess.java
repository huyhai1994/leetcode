package multithread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ResourceAccess {
    private final Semaphore semaphore = new Semaphore(3);

    public void accessResource() {
        try {
            System.out.println(Thread.currentThread().getName() + " waiting for permit.");
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " acquired permit");
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " released permit");
        }
    }

    public static void main(String[] args) {
        ResourceAccess resource = new ResourceAccess();
        for (int i = 0; i < 5; i++) {
            new Thread(resource::accessResource, "Thread-" + i).start();
        }
    }
}
