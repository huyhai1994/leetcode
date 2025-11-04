package tree.minimum_depth;

import tree.TreeNode;

public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null) {
            return 1 + minDepth(root.getRight());
        }
        if (root.getRight() == null) {
            return 1 + minDepth(root.getLeft());
        }
        return 1 + Math.min(minDepth(root.getLeft()), minDepth(root.getRight()));
    }

}
