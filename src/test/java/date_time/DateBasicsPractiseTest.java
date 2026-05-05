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

    @Test
    void should_return_date_after_7_days() {
        LocalDate expect = LocalDate.now().plusDays(7);
        LocalDate actual = service.getDateAfterDays(7);
        assertEquals(expect, actual);
    }

    @Test
    void should_return_same_day_when_add_0_day() {
        LocalDate expect = LocalDate.now();
        LocalDate actual = service.getDateAfterDays(0);
        assertEquals(expect, actual);
    }

    @Test
    void should_return_previous_day_when_add_negative_day() {
        LocalDate expect = LocalDate.now().minusDays(7);
        LocalDate actual = service.getDateAfterDays(-7);
        assertEquals(expect, actual);
    }

    @Test
    void should_return_date_before_5_days() {
        LocalDate expect = LocalDate.now().minusDays(5);
        LocalDate actual = service.getDateBeforeDays(5);
        assertEquals(expect, actual);
    }

    @Test
    void should_return_same_day_when_minus_0_day() {
        LocalDate expect = LocalDate.now();
        LocalDate actual = service.getDateBeforeDays(0);
        assertEquals(expect, actual);
    }

    @Test
    void should_return_future_day_when_minus_negative_day() {
        LocalDate expect = LocalDate.now().plusDays(7);
        LocalDate actual = service.getDateBeforeDays(-7);
        assertEquals(expect, actual);
    }

    @Test
    void should_return_date_before_365_days() {
        LocalDate expect = LocalDate.now().minusDays(365);
        LocalDate actual = service.getDateBeforeDays(365);
        assertEquals(expect, actual);
    }

}