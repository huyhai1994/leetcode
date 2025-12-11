package visitor_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNode;
        List<Integer> nodeValues = new ArrayList<>();
        List<Integer> nodeColors = new ArrayList<>();
        try {
            numberOfNode = Integer.parseInt(reader.readLine());
            for (int i = 0; i < numberOfNode; i++) {
                nodeValues.add(Integer.parseInt(reader.readLine()));
            }
            for (int i = 0; i < numberOfNode; i++) {
                nodeColors.add(Integer.parseInt(reader.readLine()));
            }
            nodeValues.forEach(System.out::println);
            nodeColors.forEach(System.out::println);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
