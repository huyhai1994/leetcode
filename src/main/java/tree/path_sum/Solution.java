package tree.path_sum;

import tree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode node, int targetSum) {
        if (node == null) return false;
        return node.getVal() == targetSum;
    }
}
