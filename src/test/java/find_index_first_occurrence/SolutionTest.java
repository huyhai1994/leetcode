package find_index_first_occurrence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void case1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        Solution solution = new Solution();
        assertEquals(0, solution.strStr(haystack, needle));
    }

    @Test
    public void case2() {
        String haystack = "leetcode";
        String needle = "leeto";
        Solution solution = new Solution();
        assertEquals(-1, solution.strStr(haystack, needle));
    }

    @Test
    public void case3() {
        String haystack = "hello";
        String needle = "ll";
        Solution solution = new Solution();
        assertEquals(2, solution.strStr(haystack, needle));
    }
}