package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */
class BreakingTheRecordsTest {
  BreakingTheRecords classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new BreakingTheRecords();
  }

  @Test
  void testBreakingRecordsExample1() {
    int[] breakingRecords =
        classUnderTest.breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1});
    assertThat(breakingRecords).containsExactly(2, 4);
  }

  @Test
  void testBreakingRecordsExample2() {
    int[] breakingRecords =
        classUnderTest.breakingRecords(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42});
    assertThat(breakingRecords).containsExactly(4, 0);
  }
}
