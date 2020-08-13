package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirthdayCakeCandlesTest {

  BirthdayCakeCandles classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new BirthdayCakeCandles();
  }

  @Test
  void testBirthdayCakeCandles() {
    int cakeCandles = classUnderTest.birthdayCakeCandles(new int[]{3, 2, 1, 3});
    assertThat(cakeCandles).isEqualTo(2);
  }
}
