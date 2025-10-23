package inorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        boolean isHasOneNode = root.left == null && root.right == null && root.val != 0;
        if (root.val == 0) return List.of();
        if (isHasOneNode) return List.of(root.val);
        result.add(root.val);
        if (root.right != null) {
            result.add(root.right.val);
        }
        return result;
    }

    public void inOrder() {

    }
}

