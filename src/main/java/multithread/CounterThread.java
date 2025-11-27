package multithread;

import java.util.concurrent.TimeUnit;

public class CounterThread implements Runnable {
    private final Counter counter;
    private final String name;

    public CounterThread(Counter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Thread: " + name + " -> Count: " + counter.getNextCounter());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
