package simpleTests;

import application.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTests {

  Calculator calc = new Calculator();

  @Test(groups = {"Regression"})
  public void addTwoPositiveValuesTest() {
    int actualResult = calc.sumOfTwoPositiveValues(10, 5);
    Assert.assertEquals(actualResult, 15, "10 + 5 must be 15");
  }

  // TODO (*)
  //add tests for new methods (multiply, division, subtraction, square root, x^2)

  @Test
  public void subtractionTest(){
    int actualResult = calc.subtraction(5,4);
    Assert.assertEquals(actualResult, 1, "5 - 4 must be 1");
  }

  @Test
  public void multiplicationTest(){
    int actualResult = calc.multiplication(4,5);
    Assert.assertEquals(actualResult, 20,"4 * 5 must be 20");
  }

  @Test
  public void divisionTest(){
    double actualResult = calc.division(6.0,2.0);
    Assert.assertEquals(actualResult, 3.0, "6 / 2 must be 3");
  }

  @Test
  public void squareRootTest(){
    double actualResult = calc.squareRoot(25.0);
    Assert.assertEquals(actualResult, 5.0,"Square root of 25 must be 5" );
  }

  @Test
  public void powerTest(){
    double actualResult = calc.power(5.0);
    Assert.assertEquals(actualResult, 25.0, "5^5 must be 25");
  }

}
