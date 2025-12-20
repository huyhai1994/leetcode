package number_to_binary;

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

    // Additional test cases added for better coverage
    @Test
    void inputAs0Case() {
        int number = 0;
        String expectedResult = "0";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs5Case() {
        int number = 5;
        String expectedResult = "101";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs6Case() {
        int number = 6;
        String expectedResult = "110";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs7Case() {
        int number = 7;
        String expectedResult = "111";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs8Case() {
        int number = 8;
        String expectedResult = "1000";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs16Case() {
        int number = 16;
        String expectedResult = "10000";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs31Case() {
        int number = 31;
        String expectedResult = "11111";
        assertEquals(expectedResult, Solution.numberToBinary(number));
    }

    @Test
    void inputAs1023Case() {
        int number = 1023; // 2^10 - 1 -> ten 1's
        assertEquals(Integer.toBinaryString(number), Solution.numberToBinary(number));
    }

    @Test
    void inputAs1024Case() {
        int number = 1024; // 2^10 -> 1 followed by ten 0's
        assertEquals(Integer.toBinaryString(number), Solution.numberToBinary(number));
    }

    @Test
    void inputAsMaxIntCase() {
        int number = Integer.MAX_VALUE;
        assertEquals(Integer.toBinaryString(number), Solution.numberToBinary(number));
    }
}