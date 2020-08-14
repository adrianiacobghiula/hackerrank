package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DayOfTheProgrammerTest {
  DayOfTheProgrammer classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new DayOfTheProgrammer();
  }

  @Test
  public void testDay256Sample0() {
    String dayOfProgrammer = classUnderTest.dayOfProgrammer(2017);
    assertThat(dayOfProgrammer).isEqualTo("13.09.2017");
  }

  @Test
  public void testDay256Sample1() {
    String dayOfProgrammer = classUnderTest.dayOfProgrammer(2016);
    assertThat(dayOfProgrammer).isEqualTo("12.09.2016");
  }

  @Test
  public void testDay256Sample2() {
    String dayOfProgrammer = classUnderTest.dayOfProgrammer(1800);
    assertThat(dayOfProgrammer).isEqualTo("12.09.1800");
  }
}
