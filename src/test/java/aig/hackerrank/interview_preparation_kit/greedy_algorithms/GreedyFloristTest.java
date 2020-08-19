package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GreedyFloristTest {
  GreedyFlorist classUnderTest = new GreedyFlorist();

  @Test
  void testSample0() {
    int minimumCost = classUnderTest.getMinimumCost(3, new int[] {1, 2, 3, 4});
    assertThat(minimumCost).isEqualTo(11);
  }

  @Test
  void testSample1() {
    int minimumCost = classUnderTest.getMinimumCost(3, new int[] {2, 5, 6});
    assertThat(minimumCost).isEqualTo(13);
  }

  @Test
  void testSample2() {
    int minimumCost = classUnderTest.getMinimumCost(2, new int[] {2, 5, 6});
    assertThat(minimumCost).isEqualTo(15);
  }

  @Test
  void testSample3() {
    int minimumCost = classUnderTest.getMinimumCost(3, new int[] {1, 3, 5, 7, 9});
    assertThat(minimumCost).isEqualTo(29);
  }
}
