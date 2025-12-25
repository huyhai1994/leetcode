package compare_triplet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testCase0() {
        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(6);
        listA.add(7);
        List<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(6);
        listB.add(10);
        List<Integer> expectedArrays = Arrays.asList(1, 1);
        assertIterableEquals(expectedArrays, Solution.compareTriplets(listA, listB));
    }
}