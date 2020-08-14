package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisibleSumPairsTest {
  DivisibleSumPairs classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new DivisibleSumPairs();
  }

  @Test
  void testDivisibleSumPairsSample1() {
    int sumPairs = classUnderTest.divisibleSumPairs(6, 3, new int[] {1, 3, 2, 6, 1, 2});
    assertThat(sumPairs).isEqualTo(5);
  }
}
