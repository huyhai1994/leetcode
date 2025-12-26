package diagonal_diff;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    @Test
    void case0() {
        List<List<Integer>> input2DArr = new ArrayList<>();
        List<Integer> firstRow = Arrays.asList(11, 2, 4);
        List<Integer> secondRow = Arrays.asList(4, 5, 6);
        List<Integer> thirdRow = Arrays.asList(10, 8, -12);
        input2DArr.add(firstRow);
        input2DArr.add(secondRow);
        input2DArr.add(thirdRow);
        assertEquals(15, Result.diagonalDifference(input2DArr));
    }

}