package tree.symmetric_tree;

import tree.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root != null && root.getLeft() == null && root.getRight() == null;
    }
}
