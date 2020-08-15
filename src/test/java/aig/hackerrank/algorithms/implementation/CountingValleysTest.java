package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CountingValleysTest {
  CountingValleys classUnderTest = new CountingValleys();

  @Test
  void testCountingValleysSample0() {
    int countingValleys = classUnderTest.countingValleys(8, "UDDDUDUU");
    assertThat(countingValleys).isEqualTo(1);
  }
}
