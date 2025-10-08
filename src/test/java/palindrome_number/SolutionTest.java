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
        @Test
        @DisplayName("0 as input")
        public void case4() {
            int x = 0;
            assertTrue(Solution.isPalindrome(x));
        }

        @Test
        @DisplayName("1 as input")
        public void case5() {
            int x = 1;
            assertTrue(Solution.isPalindrome(x));
        }

        @Test
        @DisplayName("11 as input")
        public void case6() {
            int x = 11;
            assertTrue(Solution.isPalindrome(x));
        }

        @Test
        @DisplayName("12321 as input")
        public void case7() {
            int x = 12321;
            assertTrue(Solution.isPalindrome(x));
        }

        @Test
        @DisplayName("123 as input")
        public void case8() {
            int x = 123;
            assertFalse(Solution.isPalindrome(x));
        }

        @Test
        @DisplayName("100 as input")
        public void case9() {
            int x = 100;
            assertFalse(Solution.isPalindrome(x));
        }
}