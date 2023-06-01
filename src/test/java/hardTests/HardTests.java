package hardTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import application.Calculator;

public class HardTests {

  Calculator calc = new Calculator();

  @Test
  public void sumOfAnyNumbersTest() {
    int actualResult = calc.sumOfAnyNumbers(3, 2, 5);
    Assert.assertEquals(actualResult, 10, "3 + 2 + 5 must be 10");
  }

  @Test
  public void divideByZeroTest() {
    double actualResult = calc.divideByZeroCase(3, 0);
    Assert.assertEquals(actualResult, -100.0, "b = 0, that's why should be returned -100");
  }
}
