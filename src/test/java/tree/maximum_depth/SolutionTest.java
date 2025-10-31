package tree.maximum_depth;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void OneDepthTree() {
        TreeNode root = new TreeNode(1);
        int expectedValue = 1;
        assertEquals(expectedValue, new Solution().maxDepth(root));
    }

}