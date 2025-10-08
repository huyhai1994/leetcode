package palindrome_number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("121 as input")
    public void case1() {
        int x = 121;
        assertTrue(Solution.isPalindrome(x));
    }

    @Test
    @DisplayName("-121 as input")
    public void case2() {
        int x = -121;
        assertFalse(Solution.isPalindrome(x));
    }

    @Test
    @DisplayName("10 as input")
    public void case3() {
        int x = 10;
        assertFalse(Solution.isPalindrome(x));
    }
}