package tree.path_sum;

import tree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.getLeft() == null && root.getRight() == null) {
            return root.getVal() == targetSum;
        }
        int remain = targetSum - root.getVal();
        return hasPathSum(root.getLeft(), remain) || hasPathSum(root.getRight(), remain);
    }
}
