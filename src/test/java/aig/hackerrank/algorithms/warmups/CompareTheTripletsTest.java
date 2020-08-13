package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompareTheTripletsTest {

  CompareTheTriplets classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new CompareTheTriplets();
  }

  @Test
  void testCompareTriplets() {
    List<Integer> comparison =
        classUnderTest.compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10));
    assertThat(comparison).hasSize(2).containsExactly(1, 1);
  }
}
