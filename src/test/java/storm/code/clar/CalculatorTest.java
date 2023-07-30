package storm.code.clar;

import org.junit.jupiter.api.*;
import storm.code.generator.NameGenerator;

/**
 * @author Asep Saputra
 **/

@DisplayNameGeneration(NameGenerator.class)
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void test_divide_success() {
        int actual = calculator.divide(2,1);
        int expected = 2;
        Assumptions.assumeTrue(actual != expected);
    }

    @Test
    @Disabled
    public void test_divide_failed() {
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            calculator.divide(2, 0);
        }, "Can't divide by zero!");
    }

}
