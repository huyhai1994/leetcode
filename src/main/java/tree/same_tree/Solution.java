package tree.same_tree;

import tree.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null || q == null && p != null) return false;
        if (p == null && q == null) return true;
        return p.getVal() == q.getVal() && isSameTree(p.getLeft(), q.getLeft());
    }
}
