package date_time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateBasicsPractiseTest {
    private final DateBasicsPractise service = new DateBasicsPractise();

    @Test
    void should_return_today() {
        assertEquals(LocalDate.now(), service.getToday());
    }

}