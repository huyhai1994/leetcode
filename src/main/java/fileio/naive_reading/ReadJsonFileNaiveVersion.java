package fileio.naive_reading;

import com.google.gson.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;

public class ReadJsonFileNaiveVersion {
    public static void main(String[] args) throws Exception {
        // 1. Read the file as a JSON Array
        String filePath = "cookies_prod.json";
        JsonArray jsonArray = JsonParser.parseReader(new FileReader(filePath)).getAsJsonArray();

        Gson gson = new Gson();
        List<Cookie> cookies = new ArrayList<>();

        // 2. Loop and convert JSON to Cookie objects
        for (JsonElement element : jsonArray) {
            Cookie cookie = gson.fromJson(element, Cookie.class);
            cookies.add(cookie);

            // Access the String timestamp
            String rawTimestamp = cookie.getTimestamp();
            System.out.println("Raw String: " + rawTimestamp);

            // 3. Convert String to DateTime (OffsetDateTime)
            // The format in your JSON matches ISO_OFFSET_DATE_TIME exactly
            try {
                OffsetDateTime dateTime = OffsetDateTime.parse(rawTimestamp);

                // Now you can use standard DateTime methods
                System.out.println("Parsed Year: " + dateTime.getYear());
                System.out.println("Parsed Month: " + dateTime.getMonth());
                System.out.println("Parsed Hour: " + dateTime.getHour());
                System.out.println("Parsed Timezone: " + dateTime.getOffset());

                // Example: Convert to a different format string
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                System.out.println("Formatted: " + dateTime.format(formatter));

            } catch (Exception e) {
                System.err.println("Failed to parse timestamp: " + rawTimestamp);
                e.printStackTrace();
            }

            System.out.println("---");
        }

        System.out.println("Total cookies processed: " + cookies.size());
    }


}
