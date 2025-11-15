import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

    @Test
    @DisplayName("Match letters only")
    void NonMatchLetters() {
        String failTest = "abcdenf192";
        String passTest = "asdawdawdZZZZZ";
        String regex = "^[a-zA-Z]+$";
        assertFalse(failTest.matches(regex));
        assertTrue(passTest.matches(regex));
    }

    @Test
    @DisplayName("the preceding element must occur one or more time")
    void oneMoreTimeOccurring() {
        String passTest = "a";
        String failTest = "aaaaaaaaaaaaa";
        String regex = "a";
        String regexLongRepeatedChar = "a+";
        assertTrue(passTest.matches(regex));
        assertFalse(failTest.matches(regex));
        assertTrue(failTest.matches(regexLongRepeatedChar));
    }

    @Test
    @DisplayName("Non letter case, only number")
    void nonLetterCase() {
        String passTest = "1221239809809";
        String regex = "^[^a-zA-Z]+$";
        assertTrue(passTest.matches(regex));
    }
}

