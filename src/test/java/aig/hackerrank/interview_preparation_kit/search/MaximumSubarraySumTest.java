package aig.hackerrank.interview_preparation_kit.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MaximumSubarraySumTest {

  MaximumSubarraySum classUnderTest = new MaximumSubarraySum();

  @Test
  void testExample0() {
    long maximumSum = classUnderTest.maximumSum(new long[] {1, 2, 3}, 2);
    assertThat(maximumSum).isEqualTo(1);
  }

  @Test
  void testCase0() {
    long maximumSum = classUnderTest.maximumSum(new long[] {3, 3, 9, 9, 5}, 7);
    assertThat(maximumSum).isEqualTo(6);
  }

  @Test
  void testCase2() {
    long maximumSum = classUnderTest.maximumSum(new long[] {1, 5, 9}, 5);
    assertThat(maximumSum).isEqualTo(4);
  }
}
