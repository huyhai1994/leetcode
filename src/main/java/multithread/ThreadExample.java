package multithread;

public class ThreadExample {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread newThread = new Thread(() -> {
            int i = 0;
            while (i < 1000) {
                System.out.println(Thread.currentThread() + "I'm running ...." + i++);
            }
            System.out.println("I'm shutting down, Goodbye ");
        });
        newThread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println(Thread.currentThread() + "I'm running ...." + i++);
        }
        System.out.println("I'm shutting down, Goodbye ");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println(Thread.currentThread() + "I'm running ...." + i++);
        }
        System.out.println("I'm shutting down, Goodbye ");
    }
}
