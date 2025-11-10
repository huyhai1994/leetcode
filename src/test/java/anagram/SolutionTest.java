package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void caseOneCharCase() {
        String a  = "a";
        String b = "a";
        assertTrue(Solution.isAnagram(a,b));

    }

}