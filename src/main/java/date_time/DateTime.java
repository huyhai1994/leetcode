package date_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("Current Date is " + str);

        LocalDateTime currentDate = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(currentDate);

    }
}
