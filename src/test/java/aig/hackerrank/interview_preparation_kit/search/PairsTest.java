package aig.hackerrank.interview_preparation_kit.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PairsTest {
  Pairs classUnderTest = new Pairs();

  @Test
  void testSample0() {
    int pairsCount = classUnderTest.pairs(2, new int[] {1, 5, 3, 4, 2});
    assertThat(pairsCount).isEqualTo(3);
  }
}
