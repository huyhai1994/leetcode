package validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void openAndClosedRoundParentheses() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()"));
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()[]{}"));
    }
}