package multithread;

import java.util.concurrent.TimeUnit;

public class CounterThread implements Runnable {
    Thread myThread;
    Counter counter;

    public CounterThread(Counter counter, String name) {
        this.myThread = new Thread(this, name);
        this.counter = counter;
        this.myThread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Thread: " + this.myThread.getName() + " -> Count: " + counter.getNextCounter());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
