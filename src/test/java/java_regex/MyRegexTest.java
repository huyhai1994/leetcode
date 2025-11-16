package java_regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyRegexTest {
    @Test
    void stringIpAddress() {
        String IPString1 = "I.Am.not.an.ip";
        String IPString2 = "I.Am.not.ip";
        assertFalse(IPString1.matches(new MyRegex().pattern));
        assertFalse(IPString2.matches(new MyRegex().pattern));
    }

    @Test
    void someValidIpAddress() {
        String validIP1 = "000.12.12.034";
        assertTrue(validIP1.matches(new MyRegex().pattern));
    }

}