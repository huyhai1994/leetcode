package tree.maximum_depth;

import tree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        if (root.getLeft() != null) return 2;
        return -1;
    }
}
