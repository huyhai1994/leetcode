package multithread.tutorialspoint;

import java.util.concurrent.TimeUnit;

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " exiting.");
            }
            System.out.println("Thread " + threadName + " exiting.");
        }
    }

    public void start() throws InterruptedException {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
            t.join(1000); // block current thread util another thread terminates
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
        System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().isAlive());
    }
}
