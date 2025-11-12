package pattern_syntax_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SolutionTest {

    @Test
    void validCase() {
        String inputString = "([A-Z])(.+)";
        assertEquals(VALIDATION.VALID.toString(), Solution.CheckPattern(inputString));
    }

    @Test
    void passingNullValue() {
        assertThrows(RuntimeException.class, () -> Solution.CheckPattern(null));
    }

    @Test
    void InvalidValue() {
        String pattern1 = "[AZ[a-z](a-z)";
        String pattern2 = "batcatpat(nat";
        assertEquals(VALIDATION.INVALID.toString(), Solution.CheckPattern(pattern1));
        assertEquals(VALIDATION.INVALID.toString(), Solution.CheckPattern(pattern2));
    }

}