package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleArraySumTest {

  private SimpleArraySum classUnderTest;

  @BeforeEach
  public void init() {
    classUnderTest = new SimpleArraySum();
  }

  @Test
  void testSum() {
    int sum = classUnderTest.simpleArraySum(new int[]{1, 2, 3, 4, 10, 11});
    assertThat(sum).isEqualTo(31);
  }
}
