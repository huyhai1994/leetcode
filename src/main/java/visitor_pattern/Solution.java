package visitor_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

abstract class Tree {
    int value;
    Color color;
    int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    int getValue() {
        return value;
    }

    Color getColor() {
        return color;
    }

    int getDepth() {
        return depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same reference address;
        if (o == null || this.getClass() != o.getClass()) return false;
        Tree treeNode = (Tree) o;
        return value == treeNode.value &&
                color == treeNode.color &&
                depth == treeNode.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, color);
    }

}

class TreeLeaf extends Tree {
    TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }
}

class TreeNode extends Tree {
    TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }
}

enum Color {
    RED,
    BLACK
}

public class Solution {
    static List<Integer> nodeValues;
    static List<Color> nodeColors;
    static List<Integer>[] edges;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            int numberOfNode;
            Solution sol = new Solution();
            nodeValues = new ArrayList<>();
            nodeColors = new ArrayList<>();

            numberOfNode = Integer.parseInt(reader.readLine());
            edges = new ArrayList[numberOfNode + 1];

            String lineValues = reader.readLine();
            List<String> valueParts = Arrays.asList(lineValues.split(" "));
            valueParts.forEach(value -> nodeValues.add(Integer.parseInt(value)));

            String lineColors = reader.readLine();
            List<String> colorParts = Arrays.asList(lineColors.split(" "));
            colorParts.forEach(color -> nodeColors.add(
                    Integer.parseInt(color) == 1 ? Color.RED : Color.BLACK
            ));

            for (int i = 0; i < numberOfNode - 1; i++) {
                String edgeLine = reader.readLine();
                String[] edgeParts = edgeLine.split(" ");
                int u = Integer.parseInt(edgeParts[0]);
                int v = Integer.parseInt(edgeParts[1]);
                edges[u].add(v);
                edges[v].add(u);
            }
            List<Tree> tree = new ArrayList<>();
            try {
                tree = sol.buildTree(nodeValues, nodeColors, edges);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Tree> buildTree(List<Integer> values, List<Color> colors, List<Integer>[] paths) throws RuntimeException {
        List<Tree> tree = new ArrayList<>();
        boolean[] visited = new boolean[values.size()];

        if (values == null || colors == null || paths == null) {
            throw new RuntimeException("input could not be null");
        }
        if (values.size() == 1) {
            TreeNode root = new TreeNode(values.get(0), colors.get(0), 0);
            tree.add(root);
            return tree;
        } else if (values.size() == 2) {
            TreeNode root = new TreeNode(values.get(0), colors.get(0), 0);
            tree.add(root);
            TreeLeaf leaf = new TreeLeaf(values.get(1), colors.get(1), 1);
            tree.add(leaf);
            return tree;
        }

        return tree;
    }
}
