package optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class FoundationTest {
    private static final String UNKNOWN = "unknown";

    @Test
    void user_null_return_unknown() {
        assertEquals(UNKNOWN, Foundation.getUserEmail(null));
    }

    @Test
    void user_not_have_email_return_unknown() {
        User user = new User();
        user.setEmail(null);
        assertEquals(UNKNOWN, Foundation.getUserEmail(user));
    }

    @Test
    void user_have_email_return_the_email() {
        User user = new User();
        user.setEmail("email content!");
        assertEquals("email content!", Foundation.getUserEmail(user));
    }

    @Test
    void should_not_be_empty() {
        Optional<String> shouldNotBeEmpty = Optional.empty();
        assertThrows(
                IllegalStateException.class,
                () -> shouldNotBeEmpty.orElseThrow(
                        () -> new IllegalStateException("This should not happen!!!")
                )
        );
    }

    @Test
    void demo_or_else() {
        Optional<String> optionalOrElse = Optional.empty();
        assertEquals(UNKNOWN, optionalOrElse.orElse("unknown"));
    }

    @Test
    void demo_or_else_has_value() {
        Optional<String> optionalOrElse = Optional.of("backend");
        assertEquals("backend", optionalOrElse.orElse(expensiveCall()));
    }

    private String expensiveCall() {
        System.out.println("Expensive call started!!!");
        return "unknown";
    }

    @Test
    void demo_or_else_get() {
        Optional<String> optionalOrElse = Optional.empty();
        AtomicBoolean supplierCalled = new AtomicBoolean(false);
        Supplier<String> supplier = () -> {
            supplierCalled.set(true);
            return "Big Computation Result";
        };
        assertEquals("Big Computation Result", optionalOrElse.orElseGet(supplier));
    }
}