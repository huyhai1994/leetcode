package tree.path_sum;

import tree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode node, int targetSum) {
        if (node == null) return false;
        if (node.getLeft() == null && node.getRight() == null) {
            return node.getVal() == targetSum;
        }
        if (node.getLeft() == null && node.getRight() != null) {
            return node.getRight().getVal() + node.getVal() == targetSum;
        }
        if (node.getRight() == null && node.getLeft() != null) {
            return node.getLeft().getVal() + node.getVal() == targetSum;
        }

        return (node.getVal() + node.getLeft().getVal() + node.getRight().getVal()) == targetSum;
    }
}
