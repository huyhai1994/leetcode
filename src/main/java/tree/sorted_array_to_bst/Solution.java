package tree.sorted_array_to_bst;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode sortedArrayToBst(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.setLeft(buildTree(nums, left, mid - 1));
        root.setRight(buildTree(nums, mid + 1, right));

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
