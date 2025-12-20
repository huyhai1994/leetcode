package number_to_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void inputAs1Case() {
        Solution sol = new Solution();
        int number = 1;
        String expectedResult = "1";
        assertEquals(expectedResult, sol.numberToBinary(number));
    }
}