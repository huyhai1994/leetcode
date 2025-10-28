package tree.same_tree;

import tree.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p.getVal() == q.getVal();
    }
}
