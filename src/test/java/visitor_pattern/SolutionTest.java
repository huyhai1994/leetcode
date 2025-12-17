package visitor_pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class SolutionTest {
    @Test
    @DisplayName("one node tree, only root node")
    void oneNodeTree() throws Exception {
        List<Integer> values = Collections.singletonList(1);
        List<Color> colors = Collections.singletonList(Color.RED);
        List<Integer>[] paths = new List[]{Collections.emptyList()};
        Solution sol = new Solution(values, colors, paths);
        Tree tree = new TreeLeaf(1, Color.RED, 0);
        Tree result = sol.buildTree(1);
        assertEquals(tree, result);
        assertInstanceOf(TreeLeaf.class, result);
        assertEquals(tree.getValue(), result.getValue());
        assertEquals(tree.getColor(), result.getColor());
        assertEquals(tree.getDepth(), result.getDepth());
    }


    @Test
    @DisplayName("two node tree, one root and one leaf")
    void twoNodeTree() {
//        Solution sol = new Solution();
//        List<Integer> values = Arrays.asList(1, 2);
//        List<Color> colors = Arrays.asList(Color.RED, Color.GREEN);
//        List<Integer>[] paths = new List[]{Arrays.asList(1, 2)};
//        List<Tree> buildTree = sol.buildTree(values, colors, paths);
//        List<Tree> treeExpected = Arrays.asList(
//                new TreeNode(1, Color.RED, 0),
//                new TreeLeaf(2, Color.GREEN, 1));
//        assertEquals(treeExpected.size(), buildTree.size());
//        for (int i = 0; i < treeExpected.size(); i++) {
//            assertEquals(treeExpected.get(i), buildTree.get(i));
//        }
    }
}