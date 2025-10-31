package tree.maximum_depth;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void OneDepthTree() {
        TreeNode root = new TreeNode(1);
        int expectedValue = 1;
        assertEquals(expectedValue, new Solution().maxDepth(root));
    }


    @Test
    void ZeroDepthTree() {
        int expectedValue = 0;
        assertEquals(expectedValue, new Solution().maxDepth(null));
    }

    @Test
    void twoDepthTree() {
        int expectedValue = 2;
        TreeNode root = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        root.setLeft(leftNode);
        assertEquals(expectedValue, new Solution().maxDepth(root));
    }

    @Test
    void twoDepthTreeWithLeftRightNode() {
        int expectedValue = 2;
        TreeNode root = new TreeNode(1);
        TreeNode rightNode = new TreeNode(3);
        root.setRight(rightNode);
        assertEquals(expectedValue, new Solution().maxDepth(root));
    }
}