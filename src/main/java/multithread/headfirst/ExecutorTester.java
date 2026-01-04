package multithread.headfirst;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTester {
    private static int counter;

    public static void main(String[] args) {
        Runnable job = () -> {
            counter++;
            System.out.println(Thread.currentThread().getName());
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(job);
        counter++;
        System.out.println(Thread.currentThread().getName() + " : back in main");
        Thread.dumpStack();
        executorService.shutdown();
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ExecutorTester.counter = counter;
    }
}


