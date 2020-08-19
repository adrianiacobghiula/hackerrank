package aig.hackerrank.interview_preparation_kit.string_manipulation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MakingAnagramsTest {

  MakingAnagrams classUnderTest = new MakingAnagrams();

  @Test
  void testSample0() {
    int diff = classUnderTest.makeAnagram("cde", "abc");
    assertThat(diff).isEqualTo(4);
  }
}
