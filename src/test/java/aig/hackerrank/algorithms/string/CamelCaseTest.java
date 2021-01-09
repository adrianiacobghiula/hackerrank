package aig.hackerrank.algorithms.string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CamelCaseTest {

  CamelCase classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new CamelCase();
  }

  @Test
  void sample1() {
    int count = classUnderTest.camelcase("oneTwoThree");
    assertThat(count).isEqualTo(3);
  }

  @Test
  void sample2() {
    int count = classUnderTest.camelcase("saveChangesInTheEditor");
    assertThat(count).isEqualTo(5);
  }
}
