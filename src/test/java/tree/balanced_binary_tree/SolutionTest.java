package tree.balanced_binary_tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    @DisplayName("Tree with zero node")
    void case1() {
        assertTrue(new Solution().isBalanced(null));
    }

    @Test
    @DisplayName("Tree with one node")
    void case2() {
        TreeNode root = new TreeNode(1);
        assertTrue(new Solution().isBalanced(root));
    }
}