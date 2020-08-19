package aig.hackerrank.interview_preparation_kit.string_manipulation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CommonChildTest {
  CommonChild classUnderTest = new CommonChild();

  @Test
  void testSample0() {
    int lengthCommonChild = classUnderTest.commonChild("HARRY", "SALLY");
    assertThat(lengthCommonChild).isEqualTo(2);
  }

  @Test
  void testSample1() {
    int lengthCommonChild = classUnderTest.commonChild("AA", "BB");
    assertThat(lengthCommonChild).isEqualTo(0);
  }

  @Test
  void testSample2() {
    int lengthCommonChild = classUnderTest.commonChild("SHINCHAN", "NOHARAAA");
    assertThat(lengthCommonChild).isEqualTo(3);
  }

  @Test
  void testSample3() {
    int lengthCommonChild = classUnderTest.commonChild("ABCDEF", "FBDAMN");
    assertThat(lengthCommonChild).isEqualTo(2);
  }
}
