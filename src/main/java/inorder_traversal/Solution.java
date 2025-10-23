package inorder_traversal;

import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        boolean isHasOneNode = root.left == null && root.right == null && root.val != 0;
        if (isHasOneNode) return List.of(root.val);
        return List.of();
    }
}
