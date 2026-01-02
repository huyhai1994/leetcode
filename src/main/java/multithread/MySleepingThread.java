package multithread;

import java.util.concurrent.TimeUnit;

public class MySleepingThread extends Thread {


    public MySleepingThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            try {
                System.out.println(currentThread().getName() + "running...." + i++);
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(currentThread().getName() + " shutting down, Goodbye");
    }

}
