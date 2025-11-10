package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void caseOneCharCase() {
        String a = "a";
        String b = "a";
        assertTrue(Solution.isAnagram(a, b));

    }

    @Test
    void caseAHasOneCharBHasTwoChar() {
        String a = "a";
        String b = "ab";
        assertFalse(Solution.isAnagram(a, b));
    }

    @Test
    void caseAHasTwoCharBHasTwoChar() {
        String a = "ba";
        String b = "ab";
        assertTrue(Solution.isAnagram(a, b));
    }

    @Test
    void testBasicAnagrams() {
        assertTrue(Solution.isAnagram("CAT", "ACT"));
        assertTrue(Solution.isAnagram("listen", "silent"));
        assertTrue(Solution.isAnagram("Triangle", "Integral"));
        assertTrue(Solution.isAnagram("evil", "vile"));
        assertTrue(Solution.isAnagram("Dormitory", "Dirtyroom")); // ignoring case
    }

    @Test
    void testNotAnagrams() {
        assertFalse(Solution.isAnagram("Test", "Tess"));
        assertFalse(Solution.isAnagram("Apple", "Appeal"));
        assertFalse(Solution.isAnagram("Hello", "World"));
        assertFalse(Solution.isAnagram("abc", "abcc"));
        assertFalse(Solution.isAnagram("rat", "car"));
    }

    @Test
    void testCaseInsensitive() {
        assertTrue(Solution.isAnagram("CAT", "tAc"));
        assertTrue(Solution.isAnagram("Java", "avaJ"));
        assertTrue(Solution.isAnagram("HELLO", "hello"));
    }

    @Test
    void testWithSpacesAndSpecialCharacters() {
        // Note: spaces and punctuation are counted as characters
        assertFalse(Solution.isAnagram("rail safety", "fairy tales"));
        assertTrue(Solution.isAnagram("dormitory", "dirtyroom")); // spaces removed => false, but without them true
        assertFalse(Solution.isAnagram("A man, a plan, a canal", "Panama")); // punctuation and space differences
    }

    @Test
    void testEdgeCases() {
        assertTrue(Solution.isAnagram("", "")); // both empty
        assertFalse(Solution.isAnagram("a", "")); // one empty
        assertTrue(Solution.isAnagram("a", "A")); // same letter, different case
        assertFalse(Solution.isAnagram("ab", "a")); // different lengths
    }

}