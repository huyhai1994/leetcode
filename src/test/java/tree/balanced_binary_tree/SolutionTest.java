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

    @Test
    @DisplayName("Three-node right chain (unbalanced)")
    void caseRightChain() {
        TreeNode root = new TreeNode(1);
        root.setRight(new TreeNode(2));
        root.getRight().setRight(new TreeNode(3));
        assertFalse(new Solution().isBalanced(root));
    }

    @Test
    @DisplayName("Balanced but not perfect tree")
    void caseBalancedNotPerfect() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        assertTrue(new Solution().isBalanced(root));
    }

    @Test
    @DisplayName("Zig-zag tree but balanced")
    void caseZigzagBalanced() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.getLeft().setRight(new TreeNode(3));
        assertFalse(new Solution().isBalanced(root));
    }

    @Test
    @DisplayName("Deep left skew — unbalanced")
    void caseDeepLeftUnbalanced() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.getLeft().setLeft(new TreeNode(3));
        root.getLeft().getLeft().setLeft(new TreeNode(4));
        assertFalse(new Solution().isBalanced(root));
    }

}