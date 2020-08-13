package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiagonalDifferenceTest {

  DiagonalDifference classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new DiagonalDifference();
  }

  @Test
  void testDiagonalDifference() {
    int diff =
        classUnderTest.diagonalDifference(
            Arrays.asList(
                Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12)));
    assertThat(diff).isEqualTo(15);
  }
}
