package visitor_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            System.out.println(nodeValues);
            System.out.println(nodeColors);
            System.out.println(edges);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
