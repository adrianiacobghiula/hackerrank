package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppleAndOrangeTest {
  AppleAndOrange classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new AppleAndOrange();
  }

  @Test
  void testNumberOfApples() {
    int numberOfApples = classUnderTest.count(7, 11, 5, new int[] {-2, 2, 1});
    assertThat(numberOfApples).isEqualTo(1);
  }

  @Test
  void testNumberOfOranges() {
    int numberOfApples = classUnderTest.count(7, 11, 15, new int[] {5, -6});
    assertThat(numberOfApples).isEqualTo(1);
  }
}
