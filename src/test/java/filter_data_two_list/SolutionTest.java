package filter_data_two_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {
    @Test
    void caseOneItemInEachArray() {
        List<String> list1 = List.of("a");
        List<String> list2 = List.of("a");
        assertIterableEquals(List.of("a"), new Solution().filterArrayFromInputArray(list1, list2));
    }

    @Test
    void caseTwoItemInEachArray() {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("a", "c");
        assertIterableEquals(List.of("a", "c"), new Solution().filterArrayFromInputArray(list1, list2));
    }

}