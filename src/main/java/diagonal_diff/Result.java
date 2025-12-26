package diagonal_diff;

import java.util.List;

public class Result {


    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    firstDiagonal += arr.get(i).get(j);
                }
                if (i + j == arr.size() - 1) {
                    secondDiagonal += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }}
