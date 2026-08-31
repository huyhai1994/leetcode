package functional_interface;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SquareTest {
    @Test
    void calculateSquaredValue() {
        int a = 5;
        Square square = (x) -> x * x;
        assertThat(square.calculate(a)).isEqualTo(25);
    }

}