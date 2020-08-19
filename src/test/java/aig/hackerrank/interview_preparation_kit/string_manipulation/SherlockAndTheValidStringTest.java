package aig.hackerrank.interview_preparation_kit.string_manipulation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SherlockAndTheValidStringTest {
  SherlockAndTheValidString classUnderTest = new SherlockAndTheValidString();

  @Test
  void testSample0() {
    String valid = classUnderTest.isValid("aabbcd");
    assertThat(valid).isEqualTo("NO");
  }

  @Test
  void testSample1() {
    String valid = classUnderTest.isValid("aabbccddeefghi");
    assertThat(valid).isEqualTo("NO");
  }

  @Test
  void testSample2() {
    String valid = classUnderTest.isValid("abcdefghhgfedecba");
    assertThat(valid).isEqualTo("YES");
  }
}
