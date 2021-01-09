package aig.hackerrank.algorithms.string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrongPasswordTest {

  StrongPassword classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new StrongPassword();
  }

  @Test
  void sample1() {
    int minimumNumber = classUnderTest.minimumNumber(3, "Ab1");
    assertThat(minimumNumber).isEqualTo(3);
  }

  @Test
  void sample2() {
    int minimumNumber = classUnderTest.minimumNumber(11, "#HackerRank");
    assertThat(minimumNumber).isEqualTo(1);
  }
}
