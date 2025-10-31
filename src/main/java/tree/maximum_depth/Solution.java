package tree.maximum_depth;

import tree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        depth++;
        if (root.getLeft() != null || root.getRight() != null) return ++depth;
        return depth;
    }
}
