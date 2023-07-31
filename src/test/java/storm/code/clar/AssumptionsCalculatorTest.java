package storm.code.clar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import storm.code.generator.NameGenerator;

/**
 * @author Asep Saputra
 **/

@DisplayNameGeneration(NameGenerator.class)
public class AssumptionsCalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void test_divide_success() {
        int actual = calculator.divide(2,1);
        int expected = 2;
        Assumptions.assumeTrue(expected == actual);
    }

    @Test
    void test_divide_failed() {
        int numerator = 2;
        int denominator = 0;
        Assumptions.assumeTrue(denominator == 0);

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(numerator, denominator);
        }, "Can't divide by zero!");
    }

}
