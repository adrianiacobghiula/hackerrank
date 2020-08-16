package aig.hackerrank.interview_preparation_kit.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MarkAndToysTest {

  MarkAndToys classUnderTest = new MarkAndToys();

  @Test
  void testSample0() {
    int maximumToys = classUnderTest.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50);
    assertThat(maximumToys).isEqualTo(4);
  }
}
