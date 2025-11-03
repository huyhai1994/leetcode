package tree.path_sum;

import tree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode node, int targetSum) {
        if (node == null) return false;
        if (node.getLeft() == null && node.getRight() == null) {
            return node.getVal() == targetSum;
        }
        int remain = targetSum - node.getVal();
        return hasPathSum(node.getLeft(), remain) || hasPathSum(node.getRight(), remain);
    }
}
