package tree.path_sum;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test
    void emptyRootCase() {
        TreeNode root = new TreeNode();
        int targetSum = 0;
        assertFalse(new Solution().hasPathSum(root, targetSum));
    }
}