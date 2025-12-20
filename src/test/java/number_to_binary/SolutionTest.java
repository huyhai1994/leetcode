package number_to_binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void inputAs1Case() {
        int number = 1;
        String expectedResult = "1";
        assertEquals(expectedResult, sol.numberToBinary(number));
    }

    @Test
    void inputAs2Case() {
        int number = 2;
        String expectedResult = "10";
        assertEquals(expectedResult, sol.numberToBinary(number));
    }

    @Test
    void inputAs3Case() {
        int number = 3;
        String expectedResult = "11";
        assertEquals(expectedResult, sol.numberToBinary(number));
    }

    @Test
    void inputAs4Case() {
        int number = 4;
        String expectedResult = "100";
        assertEquals(expectedResult, sol.numberToBinary(number));
    }
}