package jmm;

public class VisibilityProgram {
    private boolean running = true;
    private long count = 0;

    public void run() {
        while (running) {
            count++;
        }
        System.out.println("Stopped at count:  " + count);
    }

    public void stop() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VisibilityProgram demo = new VisibilityProgram();
        Thread worker = new Thread(demo::run);
        worker.start();

        Thread.sleep(1000);
        demo.stop();
        worker.join(2000);
        if ((worker.isAlive())) {
            System.out.println("Thread never stopped");
        }
    }
}
