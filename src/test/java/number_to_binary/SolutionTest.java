package number_to_binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void inputAs1Case() {
        int number = 1;
        String expectedResult = "1";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs2Case() {
        int number = 2;
        String expectedResult = "10";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs3Case() {
        int number = 3;
        String expectedResult = "11";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs4Case() {
        int number = 4;
        String expectedResult = "100";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs9Case() {
        int number = 9;
        String expectedResult = "1001";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs10Case() {
        int number = 10;
        String expectedResult = "1010";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }
}