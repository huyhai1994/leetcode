package character_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterJavaApiTest {

    @Test
    void whenCharacterIsLetter_thenReturnTrue() {
        assertTrue(Character.isLetter('c'));
    }

    @Test
    void whenCharacterIsNotLetter_thenReturnFalse() {
        assertFalse(Character.isLetter('1'));
    }

    @Test
    void whenCharacterIsDigit_thenReturnTrue() {
        assertTrue(Character.isDigit('1'));
    }

    @Test
    void whenCharacterIsNotDigit_thenReturnFalse() {
        assertFalse(Character.isDigit('c'));
    }

    @Test
    void whenCharacterIsLetterOrDigit_ThenReturnTrue() {
        assertAll(
                () -> assertTrue(Character.isLetterOrDigit('C')),
                () -> assertTrue(Character.isLetterOrDigit('1'))
        );
    }

    @Test
    void whenCharacterIsNotLetterOrDigit_ThenReturnTrue() {
        assertAll(
                () -> assertFalse(Character.isLetterOrDigit(',')),
                () -> assertFalse(Character.isLetterOrDigit(':')),
                () -> assertFalse(Character.isLetterOrDigit('/')),
                () -> assertFalse(Character.isLetterOrDigit('~')),
                () -> assertFalse(Character.isLetterOrDigit(' '))
        );
    }

    @Test
    void whenIsWhiteSpace_thenReturnTrue() {
        assertTrue(Character.isWhitespace(' '));
        assertTrue(Character.isWhitespace('\n'));
        assertTrue(Character.isWhitespace('\t'));
    }

    @Test
    void whenSubtractCharacterZero_thenReturnDigit() {
        assertEquals(8, '8' - '0');
        assertEquals(9, '9' - '0');
    }

    @Test
    void whenConvertCharacterToDigit_thenReturnCharacter() {
        assertEquals('8', (char) (8 + '0'));
    }

    @Test
    void whenConvertLowerCaseToUpperCase_thenReturnUpperCase() {
        assertEquals('C', Character.toUpperCase('c'));
    }

    @Test
    void whenConcertUpperCaseToLowerCase_thenReturnLowerCase() {
        assertEquals('c', Character.toLowerCase('C'));
    }

    @Test
    void whenConvertOneNumber_thenReturnCharacterA() {
        int number = 1;
        char letter = (char) ('A' + (number - 1));
        assertEquals('A', letter);
    }

    @Test
    void whenConvert65_thenReturnCharacterA() {
        int number = 65;
        assertEquals('A', (char) number);
    }
}
