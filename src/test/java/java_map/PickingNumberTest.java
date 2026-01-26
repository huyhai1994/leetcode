package java_map;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PickingNumberTest {

    @Test
    void testCase1() {
        List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);
        assertEquals(3, PickingNumber.pickingNumber(a));

    }

    @Test
    void testCase2() {
        List<Integer> a = Arrays.asList(1, 100, 2, 101, 3, 102);
        assertEquals(4, PickingNumber.pickingNumber(a));
    }
}