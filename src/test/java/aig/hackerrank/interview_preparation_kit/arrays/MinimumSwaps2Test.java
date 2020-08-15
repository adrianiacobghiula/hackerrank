package aig.hackerrank.interview_preparation_kit.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MinimumSwaps2Test {
  MinimumSwaps2 classUnderTest = new MinimumSwaps2();

  @Test
  void testMinimumSwapsSample0() {
    int minimumSwaps = classUnderTest.minimumSwaps(new int[] {7, 1, 3, 2, 4, 5, 6});
    assertThat(minimumSwaps).isEqualTo(5);
  }

  @Test
  void testMinimumSwapsSample1() {
    int minimumSwaps = classUnderTest.minimumSwaps(new int[] {4, 3, 1, 2});
    assertThat(minimumSwaps).isEqualTo(3);
  }
  @Test
  void testMinimumSwapsSample2() {
    int minimumSwaps = classUnderTest.minimumSwaps(new int[] {1, 2, 4, 3});
    assertThat(minimumSwaps).isEqualTo(1);
  }
}
