package aig.hackerrank.interview_preparation_kit.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MinimumTimeRequiredTest {

  @Test
  void testExample() {
    MinimumTimeRequired classUnderTest = new MinimumTimeRequired(new long[] {2, 3, 2});
    long minTime = classUnderTest.minTime(10);
    assertThat(minTime).isEqualTo(8);
  }

  @Test
  void testSample0() {
    MinimumTimeRequired classUnderTest = new MinimumTimeRequired(new long[] {2, 3});
    long minTime = classUnderTest.minTime(5);
    assertThat(minTime).isEqualTo(6);
  }

  @Test
  void testSample1() {
    MinimumTimeRequired classUnderTest = new MinimumTimeRequired(new long[] {1, 3, 4});
    long minTime = classUnderTest.minTime(10);
    assertThat(minTime).isEqualTo(7);
  }

  @Test
  void testSample2() {
    MinimumTimeRequired classUnderTest = new MinimumTimeRequired(new long[] {4, 5, 6});
    long minTime = classUnderTest.minTime(12);
    assertThat(minTime).isEqualTo(20);
  }
}
