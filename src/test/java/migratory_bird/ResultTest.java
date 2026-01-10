package migratory_bird;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void case1() {
        List<Integer> birds = Arrays.asList(
                1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4
        );
        assertEquals(3, Result.migratoryBirds(birds));
    }

    @Test
    void case2() {
        List<Integer> birds = Arrays.asList(
                1, 4, 4, 4, 5, 3
        );

        assertEquals(4, Result.migratoryBirds(birds));
    }
}