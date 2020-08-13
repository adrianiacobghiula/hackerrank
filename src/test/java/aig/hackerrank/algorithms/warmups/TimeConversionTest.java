package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

  TimeConversion classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new TimeConversion();
  }

  @Test
  void testTimeConversionPM() {
    String converted = classUnderTest.timeConversion("04:29:21PM");
    assertThat(converted).isEqualTo("16:29:21");
  }

  @Test
  void testTimeConversionAM() {
    String converted = classUnderTest.timeConversion("03:35:21AM");
    assertThat(converted).isEqualTo("03:35:21");
  }
}
