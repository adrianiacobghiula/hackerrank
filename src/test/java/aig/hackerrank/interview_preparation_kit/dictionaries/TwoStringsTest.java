package aig.hackerrank.interview_preparation_kit.dictionaries;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TwoStringsTest {
  TwoStrings classUnderTest = new TwoStrings();

  @Test
  void testHasCommonSubstringsSample0() {
    String commonSubstrings = classUnderTest.hasCommonSubstrings("hello", "world");
    assertThat(commonSubstrings).isEqualTo("YES");
  }

  @Test
  void testHasCommonSubstringsSample1() {
    String commonSubstrings = classUnderTest.hasCommonSubstrings("hi", "worlf");
    assertThat(commonSubstrings).isEqualTo("NO");
  }
}
