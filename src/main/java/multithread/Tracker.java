package multithread;

public class Tracker {
    public static void main(String[] args) {
        Counter counterObj = new Counter();
        CounterThread counterThreadObj1 = new CounterThread(counterObj, "Thread 1");
        CounterThread counterThreadObj2 = new CounterThread(counterObj, "Thread 2");
        CounterThread counterThreadObj3 = new CounterThread(counterObj, "Thread 3");

    }
}

