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

}