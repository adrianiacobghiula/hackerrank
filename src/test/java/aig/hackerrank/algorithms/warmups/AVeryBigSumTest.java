package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AVeryBigSumTest {

  AVeryBigSum classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new AVeryBigSum();
  }

  @Test
  void testSum() {
    long sum =
        classUnderTest.aVeryBigSum(
            new long[]{1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L});
    assertThat(sum).isEqualTo(5000000015L);
  }
}
