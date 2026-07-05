package multithread.headfirst.dead_lock;

public class Deadlock {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: holding lock1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: waiting for lock2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: holding lock1 and lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: holding lock2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2: waiting for lock1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: holding lock2 and lock1");
                }
            }
        });

        t1.start();
        t2.start();

        // Optional: join threads (they will never complete due to deadlock)
        // t1.join();
        // t2.join();
    }
}