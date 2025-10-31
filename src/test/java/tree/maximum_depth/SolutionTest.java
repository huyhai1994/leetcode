package tree.maximum_depth;

import org.junit.jupiter.api.DisplayName;
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
    void twoDepthTreeWithOneRightNode() {
        int expectedValue = 2;
        TreeNode root = new TreeNode(1);
        TreeNode rightNode = new TreeNode(3);
        root.setRight(rightNode);
        assertEquals(expectedValue, new Solution().maxDepth(root));
    }

    @Test
    @DisplayName("two left node + one right node case")
    void ThreeDepthTreeWithTwoLeftOneRightNode() {
        int expectedValue = 3;
        TreeNode root = new TreeNode(1);
        TreeNode rightNode = new TreeNode(3);
        TreeNode firstLeftNode = new TreeNode(2);
        TreeNode secondLeftNode = new TreeNode(4);
        root.setRight(rightNode);
        root.setLeft(firstLeftNode);
        rightNode.setLeft(secondLeftNode);
        assertEquals(expectedValue, new Solution().maxDepth(root));
    }
}