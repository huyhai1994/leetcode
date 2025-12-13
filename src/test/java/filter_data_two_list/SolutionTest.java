package filter_data_two_list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {
    @Test
    void caseOneItemInEachArray() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        List<String> expected = new ArrayList<>();
        expected.add("a");
        assertIterableEquals(expected, new Solution().filterArrayFromInputArray(list1, list2));
    }

    @Test
    void caseTwoItemInEachArray() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("c");
        assertIterableEquals(expected, new Solution().filterArrayFromInputArray(list1, list2));
    }

}