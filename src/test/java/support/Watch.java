package support;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Watch implements AutoCloseable {

    private final long start;

    public Watch() {
        start = System.currentTimeMillis();
    }

    @Override
    public void close() {
        long duration = System.currentTimeMillis() - start;
        log.info("Done in {} msecs", duration);
    }

    public static Watch getWatch() {
        return new Watch();
    }
}
