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

}