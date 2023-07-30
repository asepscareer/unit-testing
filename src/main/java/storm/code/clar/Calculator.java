package storm.code.clar;

/**
 * @author Asep Saputra
 **/

public class Calculator {

    public int divide(int a, int b) {
        if (b != 0) {
            return a/b;
        } else {
            throw new ArithmeticException("Can't divide by zero!");
        }
    }

}