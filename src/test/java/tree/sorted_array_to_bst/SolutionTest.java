package tree.sorted_array_to_bst;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {

    @Test
    void caseZeroNode() {
        int[] array = {};
        List<Integer> expected = Collections.emptyList();
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseOneNode() {
        int[] array = {1};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseTwoNode() {
        int[] array = {1, 2};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseThreeNode() {
        int[] array = {1, 2, 3};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseFourNode() {
        int[] array = {1, 2, 3, 4};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseDuplicates() {
        int[] array = {1, 1, 2, 3};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseNegativeNumbers() {
        int[] array = {-3, -2, -1, 0, 1};
        List<Integer> expected = new ArrayList<>();
        expected.add(-3);
        expected.add(-2);
        expected.add(-1);
        expected.add(0);
        expected.add(1);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseLargeEven() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }

    @Test
    void caseLargeOdd() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        expected.add(11);
        assertIterableEquals(expected, Solution.inorderTraversal(new Solution().sortedArrayToBst(array)));
    }
}