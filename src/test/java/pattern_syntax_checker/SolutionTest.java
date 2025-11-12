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

}