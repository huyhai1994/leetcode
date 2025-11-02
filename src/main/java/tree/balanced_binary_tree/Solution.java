package tree.balanced_binary_tree;

import tree.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;
        int left = checkHeight(root.getLeft());
        int right = checkHeight(root.getRight());
        if (left == -1) return -1;
        if (right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
}
