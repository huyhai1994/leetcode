package supply;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class LazyExampleTest {

    @Test
    void supplier_should_return_string() {
        String result = LazyExample.processData(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Heavy Data Result";
        });
        assertEquals("Processed Heavy Data Result", result);
    }

}