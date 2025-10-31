package tree.sorted_array_to_bst;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {

    @Test
    void caseZeroNode() {
        int[] array = {};
        List<Integer> expected = List.of();
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseOneNode() {
        int[] array = {1};
        List<Integer> expected = List.of(1);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseTwoNode() {
        int[] array = {1, 2};
        List<Integer> expected = List.of(1, 2);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseThreeNode() {
        int[] array = {1, 2, 3};
        List<Integer> expected = List.of(1, 2, 3);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseFourNode() {
        int[] array = {1, 2, 3, 4};
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }
}