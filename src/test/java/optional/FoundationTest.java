package optional;

import org.junit.jupiter.api.Test;

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
}