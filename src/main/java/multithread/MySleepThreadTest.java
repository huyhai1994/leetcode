package multithread;

public class MySleepThreadTest {
    public static void main(String[] args) {
        MySleepingThread myThread1 = new MySleepingThread("Thead 1");
        MySleepingThread myThread2 = new MySleepingThread("Thead 2");
        MySleepingThread myThread3 = new MySleepingThread("Thead 3");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        try {
            myThread1.join(10 * 1000);
            myThread2.join(10 * 1000);
            myThread3.join(10 * 1000);
            System.out.println("Thread main is shutting down");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

