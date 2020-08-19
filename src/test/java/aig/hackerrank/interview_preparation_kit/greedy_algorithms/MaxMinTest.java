package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MaxMinTest {

  MaxMin maxMin = new MaxMin();

  @Test
  void testSampleExample() {
    int unfairness = maxMin.maxMin(2, new int[] {1, 4, 7, 2});
    assertThat(unfairness).isEqualTo(1);
  }

  @Test
  void testSample0() {
    int unfairness = maxMin.maxMin(3, new int[] {10, 100, 300, 200, 1000, 20, 30});
    assertThat(unfairness).isEqualTo(20);
  }

  @Test
  void testSample1() {
    int unfairness = maxMin.maxMin(4, new int[] {1, 2, 3, 4, 10, 20, 30, 40, 100, 200});
    assertThat(unfairness).isEqualTo(3);
  }

  @Test
  void testSample2() {
    int unfairness = maxMin.maxMin(2, new int[] {1, 2, 1, 2, 1});
    assertThat(unfairness).isEqualTo(0);
  }
}
