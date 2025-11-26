package multithread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class HTMLCrawlingExample {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> results = new ConcurrentHashMap<>();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread crawlThread = getThread(i, results);
            threads.add(crawlThread);
            crawlThread.start();
        }

        for (Thread t : threads) {
            try {
                t.join(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Now all threads are done; process results
        System.out.println("All threads finished. Results:");
        for (int i = 0; i < 10; i++) {
            System.out.println(results.get(i));
        }
    }

    private static Thread getThread(int i, ConcurrentHashMap<Integer, String> results) {
        final int threadId = i;
        return new Thread(() -> {
            try {
                String urlString = "https://httpbin.org/html";
                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder html = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    html.append(line);
                }
                reader.close();

                results.put(threadId, "Thread " + threadId + " crawled: " + html.substring(0, 100) + "...");
                System.out.println("Thread " + threadId + " finished crawling.");
            } catch (Exception e) {
                results.put(threadId, "Thread " + threadId + " error: " + e.getMessage());
            }
        });
    }
}
