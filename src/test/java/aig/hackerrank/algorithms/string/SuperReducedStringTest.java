package aig.hackerrank.algorithms.string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuperReducedStringTest {

  SuperReducedString classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new SuperReducedString();
  }

  @Test
  void sample1() {
    String reducedString = classUnderTest.superReducedString("aaabccddd");
    assertThat(reducedString).isEqualTo("abd");
  }

  @Test
  void sample2() {
    String reducedString = classUnderTest.superReducedString("aa");
    assertThat(reducedString).isEqualTo("Empty String");
  }

  @Test
  void sample3() {
    String reducedString = classUnderTest.superReducedString("baab");
    assertThat(reducedString).isEqualTo("Empty String");
  }
}
