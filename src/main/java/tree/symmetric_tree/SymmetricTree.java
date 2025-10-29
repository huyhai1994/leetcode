package tree.symmetric_tree;

import tree.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        if (root.getLeft() == null && root.getRight() == null) return true;
        if (root.getLeft() == null || root.getRight() == null) return false;
        return root.getLeft().getVal() == root.getRight().getVal();
    }
}
