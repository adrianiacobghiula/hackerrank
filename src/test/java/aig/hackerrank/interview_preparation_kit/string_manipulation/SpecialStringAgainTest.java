package aig.hackerrank.interview_preparation_kit.string_manipulation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SpecialStringAgainTest {
  SpecialStringAgain classUnderTest = new SpecialStringAgain();

  @Test
  void testSample0() {
    long count = classUnderTest.substrCount("asasd");
    assertThat(count).isEqualTo(7);
  }

  @Test
  void testSample1() {
    long count = classUnderTest.substrCount("abcbaba");
    assertThat(count).isEqualTo(10);
  }
  @Test
  void testSample2() {
    long count = classUnderTest.substrCount("aaaa");
    assertThat(count).isEqualTo(10);
  }
}
