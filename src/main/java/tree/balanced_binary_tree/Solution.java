package tree.balanced_binary_tree;

import tree.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return root.getVal() != 0;
    }
}
