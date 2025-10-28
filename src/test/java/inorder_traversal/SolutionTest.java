package inorder_traversal;

import org.junit.jupiter.api.Test;
import tree.inorder_traversal.Solution;
import tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {
    @Test
    void oneNode() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = List.of(1);
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void emptyNode() {
        TreeNode root = new TreeNode();
        List<Integer> expected = List.of();
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void twoNode() {
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1);
        root.right = right;
        List<Integer> expected = List.of(1, 2);
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void threeNode() {
        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        TreeNode root = new TreeNode(1);

        root.right = right;
        root.left = left;
        List<Integer> expected = List.of(1, 2, 3);
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void nullRoot() {
        TreeNode root = null;
        List<Integer> expected = List.of();
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void skewedLeft() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        List<Integer> expected = List.of(1, 2, 3);
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void skewedRight() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        List<Integer> expected = List.of(1, 2, 3);
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void fullBinaryTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7);
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void duplicates() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        List<Integer> expected = List.of(2, 2, 2);
        Solution solution = new Solution();
        assertIterableEquals(expected, solution.inorderTraversal(root));
    }
}