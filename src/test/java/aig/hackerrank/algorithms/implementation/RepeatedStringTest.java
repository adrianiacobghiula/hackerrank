package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RepeatedStringTest {
  RepeatedString classUnderTest = new RepeatedString();

  @Test
  void testRepeatedStringSample0() {
    long repeatedString = classUnderTest.repeatedString("aba", 10);
    assertThat(repeatedString).isEqualTo(7);
  }

  @Test
  void testRepeatedStringSample1() {
    long repeatedString = classUnderTest.repeatedString("a", 1000000000000L);
    assertThat(repeatedString).isEqualTo(1000000000000L);
  }
}
