package aig.hackerrank.interview_preparation_kit.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
https://www.hackerrank.com/challenges/new-year-chaos
 */
public class NewYearChaosTest {
  NewYearChaos classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new NewYearChaos();
  }

  @Test
  void testMinimumBribesSample0() {
    String minimumBribes = classUnderTest.minimumBribes(new int[] {2, 1, 5, 3, 4});
    assertThat(minimumBribes).isEqualTo("3");
  }

  @Test
  void testMinimumBribesSample1() {
    String minimumBribes = classUnderTest.minimumBribes(new int[] {2, 5, 1, 3, 4});
    assertThat(minimumBribes).isEqualTo("Too chaotic");
  }
}
