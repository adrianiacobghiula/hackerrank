package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LuckBalanceTest {
  LuckBalance classUnderTest = new LuckBalance();

  @Test
  void testSample0() {
    int balance = classUnderTest.luckBalance(2, new int[][] {{5, 1}, {1, 1}, {4, 0}});
    assertThat(balance).isEqualTo(10);
  }

  @Test
  void testSample4() {
    int balance = classUnderTest.luckBalance(3, new int[][] {{5, 1}, {1, 1}, {4, 0}});
    assertThat(balance).isEqualTo(10);
  }

  @Test
  void testSample1() {
    int balance = classUnderTest.luckBalance(1, new int[][] {{5, 1}, {1, 1}, {4, 0}});
    assertThat(balance).isEqualTo(8);
  }

  @Test
  void testSample2() {
    int balance = classUnderTest.luckBalance(0, new int[][] {{5, 1}, {1, 1}, {4, 0}});
    assertThat(balance).isEqualTo(-2);
  }

  @Test
  void testSample3() {
    int balance =
        classUnderTest.luckBalance(
            3, new int[][] {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}});
    assertThat(balance).isEqualTo(29);
  }
}
