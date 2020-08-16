package aig.hackerrank.interview_preparation_kit.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CountingInversionsTest {

  CountingInversions classUnderTest = new CountingInversions();

  @Test
  void test1() {
    int[] arr = {3, 7, 12, 14, 2, 6, 9, 11};
    long swaps = classUnderTest.countInversions(arr);
    assertThat(arr).containsExactly(2, 3, 6, 7, 9, 11, 12, 14);
    assertThat(swaps).isEqualTo(11);
  }

  @Test
  void testSample0() {
    int[] arr = {1, 1, 1, 2, 2};
    long swaps = classUnderTest.countInversions(arr);
    assertThat(arr).containsExactly(1, 1, 1, 2, 2);
    assertThat(swaps).isEqualTo(0);
  }

  @Test
  void testSample1() {
    int[] arr = {2, 1, 3, 1, 2};
    long swaps = classUnderTest.countInversions(arr);
    assertThat(arr).containsExactly(1, 1, 2, 2, 3);
    assertThat(swaps).isEqualTo(4);
  }
}
