package visitor_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Tree {
    int value;
    int depth;
    Color color;

    int getValue() {
        return 0;
    }

    int getColor() {
        return 0;
    }

    int getDepth() {
        return 0;
    }
}

class TreeLeaf extends Tree {
}

class TreeNode extends Tree {
}

enum Color {
    RED,
    BLACK
}

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNode;
        List<Integer> nodeValues = new ArrayList<>();
        List<Integer> nodeColors = new ArrayList<>();
        List<int[]> edges = new ArrayList<>();
        try {
            numberOfNode = Integer.parseInt(reader.readLine());
            String lineValues = reader.readLine();
            List<String> valueParts = Arrays.asList(lineValues.split(" "));
            valueParts.forEach(value -> nodeValues.add(Integer.parseInt(value)));

            String lineColors = reader.readLine();
            List<String> colorParts = Arrays.asList(lineColors.split(" "));
            colorParts.forEach(color -> nodeColors.add(Integer.parseInt(color)));

            for (int i = 0; i < numberOfNode - 1; i++) {
                String edgeLine = reader.readLine();
                String[] edgeParts = edgeLine.split(" ");
                int u = Integer.parseInt(edgeParts[0]);
                int v = Integer.parseInt(edgeParts[1]);
                edges.add(new int[]{u, v});
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
