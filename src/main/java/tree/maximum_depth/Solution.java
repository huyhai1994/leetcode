package tree.maximum_depth;

import tree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        return -1;
    }
}
