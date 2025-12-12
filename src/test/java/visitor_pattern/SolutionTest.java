package visitor_pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("one node tree, only root node")
    void oneNodeTree() {
        Solution sol = new Solution();
        List<Integer> values = Arrays.asList(1);
        List<Color> colors = Arrays.asList(Color.RED);
        List<int[]> paths = Arrays.asList(new int[]{1, 1});
        List<Tree> tree = Arrays.asList(new TreeNode(1, Color.RED));
        assertEquals(Arrays.asList(tree.get(0)), sol.buildTree(values, colors, paths));
    }


    @Test
    @DisplayName("two node tree, one root and one leaf")
    void twoNodeTree() {
        Solution sol = new Solution();
        List<Integer> values = Arrays.asList(1, 2);
        List<Color> colors = Arrays.asList(Color.RED, Color.BLACK);
        List<int[]> paths = Arrays.asList(new int[]{1, 2});
        List<Tree> buildTree = sol.buildTree(values, colors, paths);
        List<Tree> treeExpected = Arrays.asList(
                new TreeNode(1, Color.RED),
                new TreeLeaf(2, Color.BLACK));
        assertEquals(treeExpected.size(), buildTree.size());
        for (int i = 0; i < treeExpected.size(); i++) {
            assertEquals(treeExpected.get(i), buildTree.get(i));
        }
    }
}