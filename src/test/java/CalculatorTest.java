package test.java;

import main.java.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  private static Calculator calculator = new Calculator();

  @Test
  public void verifyAddition() {
    assertEquals(45, calculator.addition(25,20));
    assertEquals(15, calculator.addition(5,10));
  }

  @Test
  public void verifySubtraction() {
    assertEquals(5, calculator.subtraction(25, 20));

  }

  @Test
  public void verifyMultiplication() {
    assertEquals(500, calculator.multiplication(25,20));

  }

  @Test
  public void verifyDivision() {
    assertEquals(1, calculator.division(25, 25));
    assertEquals(4, calculator.division(40, 10));
  }

  @Test
  public void verifyDivisionByZero() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      calculator.division(5, 0);
    });
    assertEquals(2, calculator.division(10, 5));
  }
}


