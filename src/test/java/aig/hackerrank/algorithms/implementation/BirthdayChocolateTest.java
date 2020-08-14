package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BirthdayChocolateTest {
  BirthdayChocolate classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new BirthdayChocolate();
  }

  @Test
  void testBirthdaySample0() {
    int validCuts = classUnderTest.birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2);
    assertThat(validCuts).isEqualTo(2);
  }

  @Test
  void testBirthdaySample1() {
    int validCuts = classUnderTest.birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2);
    assertThat(validCuts).isEqualTo(0);
  }

  @Test
  void testBirthdaySample2() {
    int validCuts = classUnderTest.birthday(Collections.singletonList(4), 4, 1);
    assertThat(validCuts).isEqualTo(1);
  }
}
