package inorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null || root.val == 0) return List.of();
        boolean isHasOneNode = root.val != 0 && root.left == null && root.right == null;
        List<Integer> result = new ArrayList<>();
        if (isHasOneNode) return List.of(root.val);
        inOrder(root, result);
        return result;
    }

    public void inOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inOrder(node.left, result);
        result.add(node.val);
        inOrder(node.right, result);


    }
}

