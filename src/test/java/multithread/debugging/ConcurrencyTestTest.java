package multithread.debugging;

import org.junit.jupiter.api.Test;

import static multithread.debugging.ConcurrencyTest.works;
import static org.junit.jupiter.api.Assertions.assertSame;

class ConcurrencyTestTest {
    @Test
    public void test1() throws InterruptedException {
        assertSame(1, works().size());
    }

}