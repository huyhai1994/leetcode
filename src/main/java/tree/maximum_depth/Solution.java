package tree.maximum_depth;

import tree.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.getRight()), maxDepth(root.getLeft()));
    }
}
