package tree.same_tree;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void caseOneNodeSameVal() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        boolean sol = new Solution().isSameTree(p, q);
        assertTrue(sol);
    }

    @Test
    void caseOneNodeDiffVal() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        boolean sol = new Solution().isSameTree(p, q);
        assertFalse(sol);
    }
}