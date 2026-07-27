package is_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void isAnagram_whenSAndTisAnagram_thenReturnTrue() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(Main.isAnagram(s, t));
    }

    @Test
    void isAnagram_whenSAndTIsNotAnagram_thenReturnFalse() {
        String s = "rat";
        String t = "cat";
        assertFalse(Main.isAnagram(s, t));
    }

    @Test
    void isAnagram_whenSAndTNotSameLength_thenReturnFalse() {
        String s = "abc";
        String t = "abcd";
        assertFalse(Main.isAnagram(s, t));
    }

}