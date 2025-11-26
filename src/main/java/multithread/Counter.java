package multithread;

public class Counter {
    private int counter = 0;


    public int getNextCounter() {
        return counter++;
    }
}
