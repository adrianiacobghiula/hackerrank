package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MigratoryBirdsTest {
  MigratoryBirds classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new MigratoryBirds();
  }

  @Test
  void testMostCommonBirdSample0() {
    int mostCommonBird = classUnderTest.mostCommonBird(Arrays.asList(1, 4, 4, 4, 5, 3));
    assertThat(mostCommonBird).isEqualTo(4);
  }

  @Test
  void testMostCommonBirdSample1() {
    int mostCommonBird =
        classUnderTest.mostCommonBird(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
    assertThat(mostCommonBird).isEqualTo(3);
  }
}
