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
        assertEquals(tree.get(0), sol.buildTree(values.get(0), colors.get(0), paths.get(0)));
    }


}