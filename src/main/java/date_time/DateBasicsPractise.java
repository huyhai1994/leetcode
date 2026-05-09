package date_time;

import java.time.LocalDate;

public class DateBasicsPractise {

    public LocalDate getToday() {
        return LocalDate.now();
    }

    public LocalDate getDateAfterDays(int days) {
        return LocalDate.now().plusDays(days);
    }

    public LocalDate getDateBeforeDays(int days) {
        return LocalDate.now().minusDays(days);
    }

    public LocalDate getCurrentDateTime() {
        return LocalDate.now();
    }


}
