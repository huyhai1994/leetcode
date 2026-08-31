package functional_interface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SquareTest {
    @Test
    void calculateSquaredValue() {
        int a = 5;
        Square square = (x) -> x * x;
        assertThat(square.calculate(a)).isEqualTo(25);
    }

    @Test
    void predicate() {
        List<String> strings = Arrays.asList("A", "B", "C", "A");
        Predicate<String> predicate = (s) -> s.startsWith("A");
        List<String> result = strings.stream().filter(predicate).collect(Collectors.toList());
        assertThat(result).isEqualTo(Arrays.asList("A", "A"));

    }

}