package exception_handling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MyCalculatorTest {
    @Test
    void nOrPIsNegative() {
        int n = -2;
        int p = 3;
        MyCalculator myCalculator = new MyCalculator();
        assertThrows(Exception.class, () -> {
                    myCalculator.power(n, p);
                }
        );
    }

}