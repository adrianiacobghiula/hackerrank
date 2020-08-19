package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MinimumAbsoluteDifferenceTest {
  MinimumAbsoluteDifference classUnderTest = new MinimumAbsoluteDifference();

  @Test
  void testSample0() {
    int difference = classUnderTest.minimumAbsoluteDifference(new int[] {3, -7, 0});
    assertThat(difference).isEqualTo(3);
  }

  @Test
  void testSample1() {
    int difference =
        classUnderTest.minimumAbsoluteDifference(
            new int[] {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75});
    assertThat(difference).isEqualTo(1);
  }

  @Test
  void testSample2() {
    int difference = classUnderTest.minimumAbsoluteDifference(new int[] {1, -3, 71, 68, 17});
    assertThat(difference).isEqualTo(3);
  }
}
