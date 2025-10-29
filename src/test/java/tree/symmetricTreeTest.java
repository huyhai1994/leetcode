package tree;

import org.junit.jupiter.api.Test;
import tree.symmetric_tree.SymmetricTree;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeTest {
    @Test
    void onlyRootNode() {
        TreeNode root = new TreeNode(1);
        SymmetricTree sol = new SymmetricTree();
        assertTrue(sol.isSymmetric(root));

    }

}