package tree.symmetric_tree;

import tree.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        return helper(root.getLeft(), root.getRight());
    }

    private static boolean helper(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return t1.getVal() == t2.getVal()
                && helper(t1.getLeft(), t2.getRight())
                && helper(t1.getRight(), t2.getRight());
    }
}
