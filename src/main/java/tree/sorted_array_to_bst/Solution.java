package tree.sorted_array_to_bst;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode sortedArrayToBst(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        TreeNode root = new TreeNode(nums[1]);
        TreeNode leftNode = new TreeNode(nums[0]);
        root.setLeft(leftNode);
        return root;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    public static void inOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inOrder(node.getLeft(), result);
        result.add(node.getVal());
        inOrder(node.getRight(), result);
    }
}
