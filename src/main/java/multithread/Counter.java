package multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private final AtomicInteger counter = new AtomicInteger(0);


    public int getNextCounter() {
        return counter.getAndIncrement();
    }
}
