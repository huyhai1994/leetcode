import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Regex {
    @Test
    @DisplayName("One or more digits")
    void matchDigits() {
        String test = "I have 123 apples";
        String regex = "\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(test);
        assertTrue(matcher.find());
    }
}
