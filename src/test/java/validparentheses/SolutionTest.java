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

    @Test
    public void case3() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(]"));
    }

    @Test
    public void case4() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("([])"));
    }

    @Test
    public void case5() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("([)]"));
    }

    @Test
    public void case6() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("("));
    }

    @Test
    public void case7() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("([{"));
    }
}