package sqrt_x;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void case1() {
        int input = 4;
        Solution solution = new Solution();
        int expectedResult = 2;
        assertEquals(expectedResult, solution.mySqrt(input));
    }

    @Test
    void case2() {
        int input = 8;
        Solution solution = new Solution();
        int expectedResult = 2;
        assertEquals(expectedResult, solution.mySqrt(input));
    }

    @Test
    @DisplayName("Memory Limit Exceeded Case")
    void case3() {
        int input = 2147395599;
        Solution solution = new Solution();
        int expectedResult = 46339;
        assertEquals(expectedResult, solution.mySqrt(input));
    }

}