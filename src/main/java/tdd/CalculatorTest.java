package tdd;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldProperlyAddTwoNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(20,15);
        Assert.assertEquals(35, result);
    }

    @Test
    public void shouldProperlyAddTwoNegativeNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(-2,-4);
        Assert.assertEquals(-6, result);
    }

    @Test
    public void shouldProperlyAddTwoBigNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(2147483647,2);
        Assert.assertEquals(-2147483647, result);
    }
}
