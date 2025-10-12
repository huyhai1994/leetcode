package remove_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void caseOutPut1() {
        int[] nums = {1, 2};
        Solution solution = new Solution();
        assertEquals(1, solution.removeElement(nums, 1));
    }

    @Test
    public void caseOutPut2() {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        assertEquals(2, solution.removeElement(nums, 3));
    }


}