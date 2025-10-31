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
}