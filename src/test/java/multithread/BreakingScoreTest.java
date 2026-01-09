package multithread;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class BreakingScoreTest {
    @Test
    public void test1() {
        List<Integer> inputList = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> outputList = Arrays.asList(2, 4);
        assertIterableEquals(outputList, BreakingScore.breakingRecords(inputList));

    }

}