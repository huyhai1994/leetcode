package clock;

import java.time.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println("Zone: " + clock.getZone());
        System.out.println("Millis: " + clock.instant());
        System.out.println(LocalTime.now());
        System.out.println(Arrays.toString(clock.instant().toString().split("T")));
        LocalDate today = LocalDate.now();

//
//        OffsetDateTime startOfDaySimple = today.atTime(LocalTime.MIDNIGHT).atOffset(OffsetDateTime.now().getOffset());
//
//        System.out.println("Start of Today: " + startOfDaySimple);
//
//        Duration runtime = Duration.ofHours(3).plusMinutes(45);
//
//        OffsetDateTime result = startOfDaySimple.plus(runtime);
//
//        System.out.println("Result:       " + result);
//
//        LocalDate today = LocalDate.now();

        // 2. Set to start of day (00:00:00)
        LocalTime start = LocalTime.MIDNIGHT;

        // 3. Combine with a specific offset (e.g., UTC or system default)
        // Using UTC explicitly here, but you can use ZoneOffset.ofHours(2) etc.
        ZoneOffset offset = ZoneOffset.UTC;
        OffsetDateTime startOfDay = OffsetDateTime.of(today, start, offset);

        Duration runtime = Duration.ofHours(5);
        // Or from string: Duration runtime = Duration.parse("PT5H30M");

        // 5. Add runtime
        OffsetDateTime result = startOfDay.plus(runtime);

        System.out.println("Date: " + today);
        System.out.println("Start: " + startOfDay);
        System.out.println("Runtime: " + runtime);
        System.out.println("Result: " + result);

    }
}
