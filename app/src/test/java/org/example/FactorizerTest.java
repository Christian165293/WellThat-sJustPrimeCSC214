package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(0));
  }
  @Test
  void itReturnsCorrectFactorsForPrimeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(List.of(13), factorizer.primeFactors(13));
  }

  @Test
  void itReturnsCorrectFactorsForNonPrimeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 2, 3), factorizer.primeFactors(12));
  }

  @Test
  void itReturnsCorrectFactorsForAnotherNonPrimeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(3, 3, 3, 3), factorizer.primeFactors(81));
  }

  @Test
  void itReturnsCorrectFactorsForLargeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(5, 7, 7, 1327), factorizer.primeFactors(325115));
  }
}
