package big_sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    @Test
    void testCase0() {
        List<Long> inputArr = new ArrayList<>();
        inputArr.add(1000000001L);
        inputArr.add(1000000002L);
        inputArr.add(1000000003L);
        inputArr.add(1000000004L);
        inputArr.add(1000000005L);
        long expectedResult = 5000000015L;
        assertEquals(expectedResult, Result.aVeryBigSum(inputArr));
    }

}