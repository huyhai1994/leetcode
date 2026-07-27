package string_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringJavaApiTest {

    @Test
    void shouldReturnExtensionString() {
        String filename = "test.txt";
        assertEquals("txt", filename.substring(filename.lastIndexOf(".") + 1));
    }

    @Test
    void whenStringIsEmpty_thenReturnTrue() {
        String emptyString = "";
        assertTrue(emptyString.isEmpty());
    }

    @Test
    void whenGetHelloStringLength_thenReturnValueAsFive() {
        assertEquals(5, "hello".length());
    }

    @Test
    void whenGetCharAtIndexOne_thenReturnECharacter() {
        assertEquals('e', "hello".charAt(1));
        assertTrue('e' == 'e');
    }

    @Test
    void whenSubtractLowercaseA_thenReturnNumber() {
        assertEquals(2, 'c' - 'a');
    }


    @Test
    void whenStringIsBlank_thenReturnTrue() {
        String blankString = " ";
        assertTrue(blankString.trim().isEmpty());
    }
}
