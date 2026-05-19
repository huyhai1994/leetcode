package optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

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
    void demo_or_else(){
        Optional<String> optionalOrElse = Optional.empty();
        assertEquals(UNKNOWN, optionalOrElse.orElse("unknown"));
    }
}