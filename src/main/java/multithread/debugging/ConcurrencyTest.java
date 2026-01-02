package multithread.debugging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrencyTest {

    static List<Integer> works() throws InterruptedException {
        final List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        Thread thread = new Thread(() -> addIfAbsent(list, 17));
        thread.start();
        addIfAbsent(list, 17);
        thread.join();
        System.out.println("Element" + list);
        return list;
    }

    private static void addIfAbsent(List<Integer> list, int i) {
        synchronized (list) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
    }
}
