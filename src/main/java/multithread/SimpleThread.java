package multithread;

import java.util.concurrent.TimeUnit;

public class SimpleThread extends Thread {
    public int processingCount = 0;

    SimpleThread(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
    }

    @Override
    public void run() {
        System.out.println("Thread" + this.getName() + " stated");
        while (processingCount > 0) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            processingCount--;
            System.out.println("Inside Thread " + this.getName() + ", processingCount =" + processingCount);
        }
        System.out.println("Thread " + this.getName() + "existing");
    }

    public static void main(String[] args) {
        Thread t2 = new SimpleThread(10);
        t2.start();
        System.out.println("Invoking join");
        try {
            t2.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Return from join");

    }
}
