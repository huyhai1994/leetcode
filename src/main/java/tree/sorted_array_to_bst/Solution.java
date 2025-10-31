package tree.sorted_array_to_bst;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode sortedArrayToBst(int[] nums) {
        TreeNode root;
        int rootIndex = nums.length / 2;
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        if (nums.length == 2) {
            root = new TreeNode(nums[1]);
            TreeNode leftNode = new TreeNode(nums[0]);
            root.setLeft(leftNode);
            return root;
        }
        if (nums.length == 3) {
            root = new TreeNode(nums[rootIndex]);
            TreeNode leftNode = new TreeNode(nums[0]);
            TreeNode rightNode = new TreeNode(nums[nums.length - 1]);
            root.setLeft(leftNode);
            root.setRight(rightNode);
            return root;
        }
        root = new TreeNode(nums[rootIndex]);
        TreeNode leftNode = new TreeNode(nums[rootIndex - 1]);
        TreeNode rightNode = new TreeNode(nums[rootIndex + 1]);
        root.setLeft(leftNode);
        root.setRight(rightNode);
        TreeNode nextLeftNode = new TreeNode(nums[0]);
        root.getLeft().setLeft(nextLeftNode);
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
