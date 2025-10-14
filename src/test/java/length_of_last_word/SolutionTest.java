package length_of_last_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void case1() {
        String s = "Hello World";
        Solution solution = new Solution();
        assertEquals(5, solution.lengthOfLastWord(s));
    }

    @Test
    public void case2() {
        String s = "     fly me    to    the moon  ";
        Solution solution = new Solution();
        assertEquals(4, solution.lengthOfLastWord(s));
    }

    @Test
    public void case3() {
        String s = "luffy is still joyboy";
        Solution solution = new Solution();
        assertEquals(6, solution.lengthOfLastWord(s));
    }

}