package aig.hackerrank.interview_preparation_kit.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ArrayLeftRotationTest {
  ArrayLeftRotation classUnderTest = new ArrayLeftRotation();

  @Test
  void testTotLeftSample0() {
    int[] rotLeft = classUnderTest.rotLeft(new int[] {1, 2, 3, 4, 5}, 4);
    assertThat(rotLeft).containsExactly(5, 1, 2, 3, 4);
  }

  @Test
  void testTotLeftSample1() {
    int[] rotLeft = classUnderTest.rotLeft(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 1234123412);
    assertThat(rotLeft).containsExactly(6, 7, 8, 9, 1, 2, 3, 4, 5);
  }
}
