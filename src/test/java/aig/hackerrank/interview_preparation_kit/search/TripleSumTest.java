package aig.hackerrank.interview_preparation_kit.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TripleSumTest {
  TripleSum classUnderTest = new TripleSum();

  @Test
  void testExample() {
    long triplets =
        classUnderTest.triplets(new int[] {3, 5, 7}, new int[] {3, 6}, new int[] {4, 6, 9});
    assertThat(triplets).isEqualTo(4);
  }

  @Test
  void testSample0() {
    long triplets =
        classUnderTest.triplets(new int[] {1, 3, 5}, new int[] {2, 3}, new int[] {1, 2, 3});
    assertThat(triplets).isEqualTo(8);
  }

  @Test
  void testSample1() {
    long triplets =
        classUnderTest.triplets(new int[] {1, 4, 5}, new int[] {2, 3, 3}, new int[] {1, 2, 3});
    assertThat(triplets).isEqualTo(5);
  }
}
