package fileio.better_reading;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cookie {
    private String cookie;
    private OffsetDateTime timestamp;
}
