package multithread;

public class ThreadExample {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100000) {
            System.out.println("I'm running ...." + i++);
        }
        System.out.println("I'm shutting down, Goodbye ");
    }

}
