package visitor_pattern;

import design_pattern.visitor_pattern.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class SolutionTest {
    @Test
    @DisplayName("one node tree, only root node/ tree leaf")
    void oneNodeTree() {
        List<Integer> values = Collections.singletonList(1);
        List<Color> colors = Collections.singletonList(Color.RED);
        List<Integer>[] paths = new ArrayList[1];
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
        List<Integer> values = Arrays.asList(1, 2);
        List<Color> colors = Arrays.asList(Color.RED, Color.GREEN);
        List<Integer>[] paths = new ArrayList[3]; // index 0 unused
        paths[1] = new ArrayList<>();
        paths[2] = new ArrayList<>();

        paths[1].add(2);
        paths[2].add(1);
        Solution sol = new Solution(values, colors, paths);
        Tree buildTree = sol.buildTree(1);
        TreeNode root = new TreeNode(1, Color.RED, 0);
        TreeLeaf leaf = new TreeLeaf(2, Color.GREEN, 1);
        root.addChildren(leaf);
        System.out.println(buildTree);
        System.out.println(root);
    }
}