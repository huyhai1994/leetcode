package visitor_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

abstract class Tree {
    int value;
    Color color;

    public Tree(int value, Color color) {
        this.value = value;
        this.color = color;
    }

    int getValue() {
        return value;
    }

    Color getColor() {
        return color;
    }

}

class TreeLeaf extends Tree {
    TreeLeaf(int value, Color color) {
        super(value, color);
    }
}

class TreeNode extends Tree {
    TreeNode(int value, Color color) {
        super(value, color);
    }
}

enum Color {
    RED,
    BLACK
}

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNode;
        List<Integer> nodeValues = new ArrayList<>();
        List<Color> nodeColors = new ArrayList<>();
        List<int[]> edges = new ArrayList<>();
        try {
            numberOfNode = Integer.parseInt(reader.readLine());
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
                edges.add(new int[]{u, v});
            }
            for (int i = 0; i < nodeValues.size(); i++) {
                List<Tree> tree = sol.buildTree(nodeValues.get(i), nodeColors.get(i), edges.get(i));
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Tree> buildTree(Integer value, Color color, int[] path) {
        return Collections.emptyList();
    }
}
