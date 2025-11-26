package multithread;

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
        for (int i = 0; i <= 3; i++) {
            System.out.println("Thread: " + this.myThread.getName() + " -> Count: " + counter.getNextCounter());
        }
    }
}
