package mediumTests;

import application.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediumTests {

  Calculator calc = new Calculator();

  @Test
  public void averageValueTest() {
    double actualResult = calc.averageValue(1.0, 2.0, 3.0);
    Assert.assertEquals(actualResult, 2.0, "(1 + 2 + 3) / 3 must be 2");
  }

  @Test(groups = {"Smoke"})
  public void isEvenTest() {
    boolean actualResult = calc.isEven(4);
    Assert.assertTrue(actualResult, "4 must be even");
  }

  @Test
  public void biggestValueTest() {
    int actualResult = calc.biggestValue(5, 3);
    Assert.assertEquals(actualResult, 5, "5 > 3, that's why 5 should be returned");
  }

}
