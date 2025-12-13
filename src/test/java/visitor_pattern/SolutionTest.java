package visitor_pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("one node tree, only root node")
    void oneNodeTree() {
        Solution sol = new Solution();
        List<Integer> values = Collections.singletonList(1);
        List<Color> colors = Collections.singletonList(Color.RED);
        List<Integer>[] paths = new List[]{Collections.emptyList()};
        List<Tree> tree = Collections.singletonList(new TreeNode(1, Color.RED, 0));
        assertEquals(Collections.singletonList(tree.get(0)), sol.buildTree(values, colors, paths));
    }


    @Test
    @DisplayName("two node tree, one root and one leaf")
    void twoNodeTree() {
        Solution sol = new Solution();
        List<Integer> values = Arrays.asList(1, 2);
        List<Color> colors = Arrays.asList(Color.RED, Color.BLACK);
        List<Integer>[] paths = new List[]{Arrays.asList(1, 2)};
        List<Tree> buildTree = sol.buildTree(values, colors, paths);
        List<Tree> treeExpected = Arrays.asList(
                new TreeNode(1, Color.RED, 0),
                new TreeLeaf(2, Color.BLACK, 1));
        assertEquals(treeExpected.size(), buildTree.size());
        for (int i = 0; i < treeExpected.size(); i++) {
            assertEquals(treeExpected.get(i), buildTree.get(i));
        }
    }
}