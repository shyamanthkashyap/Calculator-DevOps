import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testFactorial() {
        double A = 5;
        double factorial = 120;
        double result = calculator.factorial(A); ;
        Assert.assertEquals(factorial, result, 0);
    }
    @Test
    public void testNaturalLog() {
        double A = 1;
        double naturalLog = 0;
        double result = calculator.naturalLog(A);
        Assert.assertEquals(naturalLog, result, 0);
    }
    @Test
    public void testPower() {
        double A = 5;
        double B = 2;
        double power = 25;
        double result = calculator.power(A,B);
        Assert.assertEquals(power, result, 0);
    }
    @Test
    public void testSquareRoot() {
        double A = 9;
        double squareRoot = 3;
        double result = calculator.squareRoot(A);
        Assert.assertEquals(squareRoot, result, 0);
    }
}
