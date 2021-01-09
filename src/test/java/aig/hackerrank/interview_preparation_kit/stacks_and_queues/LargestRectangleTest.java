package aig.hackerrank.interview_preparation_kit.stacks_and_queues;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LargestRectangleTest {
  LargestRectangle classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new LargestRectangle();
  }

  @Test
  void sample1() {
    long maxArea = classUnderTest.largestRectangle(new int[] {1, 2, 3, 4, 5});
    assertThat(maxArea).isEqualTo(9);
  }

  @Test
  void sample2() {
    long maxArea = classUnderTest.largestRectangle(new int[] {2, 1, 5, 6, 3, 2});
    assertThat(maxArea).isEqualTo(10);
  }

  @Test
  void sample3() {
    long maxArea = classUnderTest.largestRectangle(new int[] {4, 3, 2, 1, 2, 3, 4, 4, 5});
    assertThat(maxArea).isEqualTo(12);
  }
}
