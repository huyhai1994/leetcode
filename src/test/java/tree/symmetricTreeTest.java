package tree;

import org.junit.jupiter.api.Test;
import tree.symmetric_tree.SymmetricTree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeTest {
    @Test
    void onlyRootNode() {
        TreeNode root = new TreeNode(1);
        SymmetricTree sol = new SymmetricTree();
        assertTrue(sol.isSymmetric(root));
    }

    @Test
    void TwoNode() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.setLeft(left);
        SymmetricTree sol = new SymmetricTree();
        assertFalse(sol.isSymmetric(root));
    }

    @Test
    void ThreeNodeSymmetricTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.setLeft(left);
        root.setRight(right);
        SymmetricTree sol = new SymmetricTree();
        assertTrue(sol.isSymmetric(root));
    }

    @Test
    void ThreeNodeNoneSymmetricTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.setLeft(left);
        root.setRight(right);
        SymmetricTree sol = new SymmetricTree();
        assertFalse(sol.isSymmetric(root));
    }

    @Test
    void FourNodeNoneSymmetricTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode nextLeft = new TreeNode(3);
        root.setLeft(left);
        root.setRight(right);
        left.setLeft(nextLeft);
        SymmetricTree sol = new SymmetricTree();
        assertFalse(sol.isSymmetric(root));
    }

    @Test
    void FiveNodeSymmetricTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode nextLeft = new TreeNode(3);
        TreeNode nextRight = new TreeNode(3);
        root.setLeft(left);
        root.setRight(right);
        left.setLeft(nextLeft);
        right.setRight(nextRight);
        SymmetricTree sol = new SymmetricTree();
        assertTrue(sol.isSymmetric(root));
    }
}