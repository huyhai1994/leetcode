package java_enum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysTest {
    @Test
    void should_return_name() {
        assertEquals("MONDAY", Days.MONDAY.name());
    }

    @Test
    void should_return_0() {
        assertEquals(0, Days.MONDAY.ordinal());
    }


    @Test
    void should_be_equals() {
        assertTrue(Days.MONDAY == Days.MONDAY);
    }
}