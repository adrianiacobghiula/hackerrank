package aig.hackerrank.interview_preparation_kit.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ArrayManipulationTest {
  ArrayManipulation manipulation = new ArrayManipulation();

  @Test
  void testMaxValueSample0() {
    long max = manipulation.maxValue(new int[][] {{4, 8, 7}, {1, 5, 3}, {6, 9, 1}});
    assertThat(max).isEqualTo(10);
  }

  @Test
  void testMaxValueSample1() {
    long max = manipulation.maxValue(new int[][] {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}});
    assertThat(max).isEqualTo(200);
  }

  @Test
  void testMaxValue1() {
    long max = manipulation.maxValue(new int[][] {{1, 4, 100}, {2, 4, 100}, {4, 10, 100}});
    assertThat(max).isEqualTo(300);
  }
}
