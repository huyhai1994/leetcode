package tree.minimum_depth;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void nullRootNodeCase() {
        int expectedResult = 0;
        assertEquals(expectedResult, new Solution().minDepth(null));
    }

    @Test
    void OnlyOneRootNodeHasAnValueCase() {
        int expectedResult = 1;
        TreeNode rootNode = new TreeNode(1);
        assertEquals(expectedResult, new Solution().minDepth(rootNode));
    }

    @Test
    void oneRootAndOneLeftNodeCase() {
        int expectedResult = 2;
        TreeNode rootNode = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        rootNode.setLeft(leftNode);
        assertEquals(expectedResult, new Solution().minDepth(rootNode));
    }

    @Test
    void oneRootAndOneLeftAndOneLeftNodeCase() {
        int expectedResult = 2;
        TreeNode rootNode = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(3);
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);
        assertEquals(expectedResult, new Solution().minDepth(rootNode));
    }

    @Test
    void oneRootAndOneRightAndTwoLeftNodeCase() {
        int expectedResult = 2;
        TreeNode rootNode = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        leftNode.setLeft(new TreeNode(4));
        TreeNode rightNode = new TreeNode(3);
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);
        assertEquals(expectedResult, new Solution().minDepth(rootNode));
    }

    @Test
    void oneRootThreeRightNodeCase() {
        int expectedResult = 3;
        TreeNode rootNode = new TreeNode(1);
        TreeNode rightNode = new TreeNode(2);
        rootNode.setRight(rightNode);
        rightNode.setRight(new TreeNode(3));

        assertEquals(expectedResult, new Solution().minDepth(rootNode));
    }

    @Test
    void oneRootWithTwoLevelsBothSidesCase() {
        // Balanced tree depth = 2
        int expectedResult = 2;
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        assertEquals(expectedResult, new Solution().minDepth(root));
    }

    @Test
    void skewedTreeLeftSideCase() {
        // 1 -> 2 -> 3 -> 4, depth = 4
        int expectedResult = 4;
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.getLeft().setLeft(new TreeNode(3));
        root.getLeft().getLeft().setLeft(new TreeNode(4));

        assertEquals(expectedResult, new Solution().minDepth(root));
    }

    @Test
    void skewedTreeRightSideCase() {
        // 1 -> 2 -> 3 -> 4 (right side), depth = 4
        int expectedResult = 4;
        TreeNode root = new TreeNode(1);
        root.setRight(new TreeNode(2));
        root.getRight().setRight(new TreeNode(3));
        root.getRight().getRight().setRight(new TreeNode(4));

        assertEquals(expectedResult, new Solution().minDepth(root));
    }

    @Test
    void leftNullDeeperRightCase() {
        //    1
        //     \
        //      2
        //     /
        //    3
        //
        // Minimum depth = 2 (1 -> 2)
        int expectedResult = 3;
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        right.setLeft(new TreeNode(3));
        root.setRight(right);

        assertEquals(expectedResult, new Solution().minDepth(root));
    }

    @Test
    void rightNullDeeperLeftCase() {
        //    1
        //   /
        //  2
        //   \
        //    3
        //
        // Minimum depth = 2 (1 -> 2)
        int expectedResult = 3;
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.setRight(new TreeNode(3));
        root.setLeft(left);

        assertEquals(expectedResult, new Solution().minDepth(root));
    }

    @Test
    void leafOnRightShallowLeftDeeperCase() {
        //    1
        //   / \
        //  2   3 (leaf)
        // /
        //4
        // Minimum depth = 2 (1 -> 3)
        int expectedResult = 2;
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.setLeft(new TreeNode(4));
        TreeNode right = new TreeNode(3);

        root.setLeft(left);
        root.setRight(right);

        assertEquals(expectedResult, new Solution().minDepth(root));
    }

}