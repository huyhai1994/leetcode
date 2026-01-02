package multithread.w3_school;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("This code is running in a thread " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(10);
                System.out.println(Thread.currentThread().getName() + " shut down now!");
            } catch (InterruptedException ignored) {
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        System.out.println("This is main thread " + Thread.currentThread().getName());
        Thread.dumpStack();
    }


}
