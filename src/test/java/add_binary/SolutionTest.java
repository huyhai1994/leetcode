package add_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void case1() {
        String a = "11";
        String b = "1";
        String expectedValue = "100";
        Solution solution = new Solution();
        assertEquals(expectedValue, solution.addBinary(a, b));
    }

    @Test
    void case2() {
        String a = "1010";
        String b = "1011";
        String expectedValue = "10101";
        Solution solution = new Solution();
        assertEquals(expectedValue, solution.addBinary(a, b));
    }
}