package tree.balanced_binary_tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

    @Test
    @DisplayName("Tree with two node")
    void case3() {
        TreeNode root = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        root.setLeft(leftNode);
        assertTrue(new Solution().isBalanced(root));
    }

    @Test
    @DisplayName("Tree with three node")
    void case4() {
        TreeNode root = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(3);
        root.setLeft(leftNode);
        root.setRight(rightNode);
        assertTrue(new Solution().isBalanced(root));
    }

    @Test
    @DisplayName("Tree with three node")
    void case5() {
        TreeNode root = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode nextLeftNode = new TreeNode(3);
        root.setLeft(leftNode);
        root.getLeft().setLeft(nextLeftNode);
        assertFalse(new Solution().isBalanced(root));
    }

    @Test
    @DisplayName("Tree with four node not balanced tree")
    void case6() {
        TreeNode root = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode nextLeftNode = new TreeNode(3);
        TreeNode nextNextLeftNode = new TreeNode(4);
        root.setLeft(leftNode);
        root.getLeft().setLeft(nextLeftNode);
        root.getLeft().getLeft().setLeft(nextNextLeftNode);
        assertFalse(new Solution().isBalanced(root));
    }
}