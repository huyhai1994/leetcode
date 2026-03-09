package search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void setBinarySearch() {
        binarySearch = new BinarySearch();
    }

    @Test
    void case1() {
        List<Integer> inputList = Arrays.asList(10, 5, 1);
        assertTrue(binarySearch.search(5, inputList));
    }

    @Test
    void case2() {
        List<Integer> inputList = Arrays.asList(10, 5, 4, 1);
        assertTrue(binarySearch.search(1, inputList));
    }

    @Test
    void case3() {
        List<Integer> inputList = Arrays.asList(10, 5, 4, 1);
        assertTrue(binarySearch.search(10, inputList));
    }

    @Test
    void case4() {
        List<Integer> inputList = Arrays.asList(10, 5, 4, 1);
        assertFalse(binarySearch.search(100, inputList));
    }

    @Test
    @DisplayName("Overflow case")
    void case5() {
        List<Integer> inputList = Arrays.asList(2_000_000_000, 1_000_000_000, 4, 1);
        assertTrue(binarySearch.search(2_000_000_000, inputList));
    }

}