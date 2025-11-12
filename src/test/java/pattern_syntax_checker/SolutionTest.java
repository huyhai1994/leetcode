package pattern_syntax_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void validCase() {
        String inputString = "([A-Z])(.+)";
        assertEquals(VALIDATION.VALID.toString(), Solution.CheckPattern(inputString));

    }

}