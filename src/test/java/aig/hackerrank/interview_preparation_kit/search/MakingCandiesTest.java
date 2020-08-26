package aig.hackerrank.interview_preparation_kit.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MakingCandiesTest {

  @Test
  void testExample0() {
    long minimumPasses = new MakingCandies(1, 2, 1, 60).minimumPasses();
    assertThat(minimumPasses).isEqualTo(4);
  }

  @Test
  void testCase0() {
    long minimumPasses = new MakingCandies(3, 1, 2, 12).minimumPasses();
    assertThat(minimumPasses).isEqualTo(3);
  }

  @Test
  void testCase1() {
    long minimumPasses = new MakingCandies(1, 1, 6, 45).minimumPasses();
    assertThat(minimumPasses).isEqualTo(16);
  }

  @Test
  void testCase20() {
    long minimumPasses =
        new MakingCandies(10000000000L, 1000000000L, 5, 1000000000L).minimumPasses();
    assertThat(minimumPasses).isEqualTo(1);
  }

  @Test
  void testCase7() {
    long minimumPasses = new MakingCandies(1L, 100L, 10000000000L, 1000000000000L).minimumPasses();
    assertThat(minimumPasses).isEqualTo(617737754L);
  }

  @Test
  void testCase9() {
    long minimumPasses = new MakingCandies(1L, 1L, 499999999999L, 1000000000000L).minimumPasses();
    assertThat(minimumPasses).isEqualTo(999999999999L);
  }
}
