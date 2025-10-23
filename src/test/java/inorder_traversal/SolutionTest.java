package inorder_traversal;

import org.junit.jupiter.api.Test;

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
}