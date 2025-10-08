package romantoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void case1() {
        assertEquals(3, Solution.romanToInt("III"));
    }

    @Test
    public void case2() {
        assertEquals(4, Solution.romanToInt("IV"));
    }

    @Test
    public void case3() {
        assertEquals(9, Solution.romanToInt("IX"));
    }

    @Test
    public void case4() {
        assertEquals(58, Solution.romanToInt("LVIII"));
    }

    @Test
    public void case5() {
        assertEquals(1994, Solution.romanToInt("MCMXCIV"));
    }

    @Test
    public void case6() {
        assertEquals(1, Solution.romanToInt("I"));
    }

    @Test
    public void case7() {
        assertEquals(40, Solution.romanToInt("XL"));
    }

    @Test
    public void case8() {
        assertEquals(90, Solution.romanToInt("XC"));
    }

    @Test
    public void case9() {
        assertEquals(400, Solution.romanToInt("CD"));
    }

    @Test
    public void case10() {
        assertEquals(900, Solution.romanToInt("CM"));
    }

    @Test
    public void case11() {
        assertEquals(3999, Solution.romanToInt("MMMCMXCIX"));
    }
}