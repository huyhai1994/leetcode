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

    @Test
    void caseOneEmptyPNode() {
        TreeNode q = new TreeNode();
        boolean sol = new Solution().isSameTree(null, q);
        assertFalse(sol);
    }

    @Test
    void caseOneEmptyQNode() {
        TreeNode p = new TreeNode();
        boolean sol = new Solution().isSameTree(p, null);
        assertFalse(sol);
    }

    @Test
    void twoEmptyNodes() {
        boolean sol = new Solution().isSameTree(null, null);
        assertTrue(sol);
    }

    @Test
    void twoSameNodes() {
        TreeNode p = new TreeNode(1);
        TreeNode pLeft = new TreeNode(2);
        p.setLeft(pLeft);
        TreeNode q = new TreeNode(1);
        TreeNode qLeft = new TreeNode(2);
        q.setLeft(qLeft);
        boolean sol = new Solution().isSameTree(p, q);
        assertTrue(sol);
    }

    @Test
    void twoDiffNodes() {
        TreeNode p = new TreeNode(1);
        TreeNode pLeft = new TreeNode(2);
        p.setLeft(pLeft);
        TreeNode q = new TreeNode(1);
        TreeNode qLeft = new TreeNode(3);
        q.setLeft(qLeft);
        boolean sol = new Solution().isSameTree(p, q);
        assertFalse(sol);
    }

    @Test
    void twoSameThreeNodes() {
        TreeNode p = new TreeNode(1);
        TreeNode pLeft = new TreeNode(2);
        TreeNode pRight = new TreeNode(3);
        p.setLeft(pLeft);
        p.setRight(pRight);
        TreeNode q = new TreeNode(1);
        TreeNode qLeft = new TreeNode(2);
        TreeNode qRight = new TreeNode(3);
        q.setLeft(qLeft);
        q.setRight(qRight);
        boolean sol = new Solution().isSameTree(p, q);
        assertTrue(sol);
    }

    @Test
    void twoDiffThreeNodes() {
        TreeNode p = new TreeNode(1);
        TreeNode pLeft = new TreeNode(2);
        TreeNode pRight = new TreeNode(3);
        p.setLeft(pLeft);
        p.setRight(pRight);
        TreeNode q = new TreeNode(1);
        TreeNode qLeft = new TreeNode(2);
        TreeNode qRight = new TreeNode(4);
        q.setLeft(qLeft);
        q.setRight(qRight);
        boolean sol = new Solution().isSameTree(p, q);
        assertFalse(sol);
    }
}