package design_pattern.visitor_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution {
    private final boolean[] visited;
    private final List<Integer> nodeValues;
    private final List<Color> nodeColors;
    private final List<Integer>[] edges;


    public Solution(List<Integer> nodeValues, List<Color> nodeColors, List<Integer>[] edges) {
        this.nodeValues = nodeValues;
        this.nodeColors = nodeColors;
        this.edges = edges;
        this.visited = new boolean[nodeValues.size() + 1];
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            int numberOfNode = Integer.parseInt(reader.readLine());
            List<Integer> nodeValues = new ArrayList<>();
            List<Color> nodeColors = new ArrayList<>();
            List<Integer>[] edges = new ArrayList[numberOfNode + 1];

            String lineValues = reader.readLine();
            List<String> valueParts = Arrays.asList(lineValues.split(" "));
            valueParts.forEach(value -> nodeValues.add(Integer.parseInt(value)));

            String lineColors = reader.readLine();
            List<String> colorParts = Arrays.asList(lineColors.split(" "));
            colorParts.forEach(color -> nodeColors.add(Integer.parseInt(color) == 0 ? Color.RED : Color.GREEN));
            for (int i = 1; i <= numberOfNode; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < numberOfNode - 1; i++) {
                String edgeLine = reader.readLine();
                String[] edgeParts = edgeLine.split(" ");
                int u = Integer.parseInt(edgeParts[0]);
                int v = Integer.parseInt(edgeParts[1]);
                edges[u].add(v);
                edges[v].add(u);
            }
            Solution sol = new Solution(nodeValues, nodeColors, edges);
            Tree tree;
            try {
                tree = sol.buildTree(1);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Tree buildTree(int rootIndex) {
        if (this.nodeValues.size() == 1) {
            return new TreeLeaf(this.nodeValues.get(0), this.nodeColors.get(0), 0);
        }
        return dfs(rootIndex, 0);
    }

    private Tree dfs(int node, int depth) {
        this.visited[node] = true;
        boolean isLeaf = true;
        for (int child : this.edges[node]) {
            if (!this.visited[child]) {
                isLeaf = false;
            }
        }

        if (isLeaf)
            return new TreeLeaf(this.nodeValues.get(node - 1), this.nodeColors.get(node - 1), depth);
        TreeNode tnode = new TreeNode(nodeValues.get(node - 1), this.nodeColors.get(node - 1), depth);

        for (int child : this.edges[node]) {
            if (!visited[child]) {
                tnode.addChildren(dfs(child, depth + 1));
            }
        }
        return tnode;
    }
}
