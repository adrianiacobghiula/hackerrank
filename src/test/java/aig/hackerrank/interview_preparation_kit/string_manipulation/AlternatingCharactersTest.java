package aig.hackerrank.interview_preparation_kit.string_manipulation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AlternatingCharactersTest {
  AlternatingCharacters classUnderTest = new AlternatingCharacters();

  @Test
  void testSample0() {
    int deletions = classUnderTest.countDeletions("AAAA");
    assertThat(deletions).isEqualTo(3);
  }
  @Test
  void testSample1() {
    int deletions = classUnderTest.countDeletions("BBBBB");
    assertThat(deletions).isEqualTo(4);
  }
  @Test
  void testSample2() {
    int deletions = classUnderTest.countDeletions("ABABABAB");
    assertThat(deletions).isEqualTo(0);
  }
  @Test
  void testSample3() {
    int deletions = classUnderTest.countDeletions("BABABA");
    assertThat(deletions).isEqualTo(0);
  }
  @Test
  void testSample4() {
    int deletions = classUnderTest.countDeletions("AAABBB");
    assertThat(deletions).isEqualTo(4);
  }
}
