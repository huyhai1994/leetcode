package tree.path_sum;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void emptyRootCase() {
        int targetSum = 0;
        assertFalse(new Solution().hasPathSum(null, targetSum));
    }

    @Test
    void rootWithNonInputValue() {
        TreeNode root = new TreeNode();
        int targetSum = 0;
        assertTrue(new Solution().hasPathSum(root, targetSum));
    }

    @Test
    void onlyOneRootCase() {
        TreeNode root = new TreeNode(1);
        int targetSum = 1;
        assertTrue(new Solution().hasPathSum(root, targetSum));
    }

    @Test
    void twoNodeCaseEqualTargetSum() {
        TreeNode root = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        root.setLeft(leftNode);
        int targetSum = 3;
        assertTrue(new Solution().hasPathSum(root, targetSum));
    }
}