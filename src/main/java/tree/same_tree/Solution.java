package tree.same_tree;

import tree.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.getVal() == q.getVal()
                && isSameTree(p.getLeft(), q.getLeft())
                && isSameTree(p.getRight(), q.getRight());
    }
}
