package two_dimension_array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testCase1() {
        List<Integer> e1 = new java.util.ArrayList<>();
        e1.add(1);
        e1.add(1);
        e1.add(1);
        e1.add(0);
        e1.add(0);
        e1.add(0);
        List<Integer> e2 = new java.util.ArrayList<>();
        e2.add(0);
        e2.add(1);
        e2.add(0);
        e2.add(0);
        e2.add(0);
        e2.add(0);
        List<Integer> e6 = new java.util.ArrayList<>();
        e6.add(0);
        e6.add(0);
        e6.add(1);
        e6.add(2);
        e6.add(4);
        e6.add(0);
        List<Integer> e4 = new java.util.ArrayList<>();
        e4.add(0);
        e4.add(0);
        e4.add(2);
        e4.add(4);
        e4.add(4);
        e4.add(0);
        List<Integer> e3 = new java.util.ArrayList<>();
        e3.add(1);
        e3.add(1);
        e3.add(1);
        e3.add(0);
        e3.add(0);
        e3.add(0);
        List<Integer> e5 = new java.util.ArrayList<>();
        e5.add(0);
        e5.add(0);
        e5.add(0);
        e5.add(2);
        e5.add(0);
        e5.add(0);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);
        arr.add(e4);
        arr.add(e5);
        arr.add(e6);
        assertEquals(19, new Solution().sumHourGlass(arr));

    }

}