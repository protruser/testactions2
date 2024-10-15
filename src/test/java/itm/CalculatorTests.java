package itm;

import itm.oss.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator tests of OSS class")
public class CalculatorTests {
  
  private final Calculator calc = new Calculator();

  @Test
  @DisplayName("Test for add function")
  void add() {
    assertEquals(10, calc.add(5, 5), "Expected value is to be 10 in add function");
  }

  @Test
  @DisplayName("Testing function isPrime")
  void isFivePrime() {
    assertTrue(calc.isPrime(5), "5 is prime");
  }

  @Test
  @DisplayName("Testing function isPrime (4)")
  void isFourPrime() {
    assertFalse(calc.isPrime(4), "4 is not prime");
  }

  @Test
  @DisplayName("Testing function isPrime (0)")
  void isZeroPrime() {
    assertFalse(calc.isPrime(0), "0 is not prime");
  }
}
