package aig.hackerrank.interview_preparation_kit.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class _2DArrayDSTest {
  _2DArrayDS arrayDS = new _2DArrayDS();

  @Test
  void testHourglassSumSample1() {
    int hourglassSum =
        arrayDS.hourglassSum(
            new int[][] {
              {1, 1, 1, 0, 0, 0},
              {0, 1, 0, 0, 0, 0},
              {1, 1, 1, 0, 0, 0},
              {0, 0, 2, 4, 4, 0},
              {0, 0, 0, 2, 0, 0},
              {0, 0, 1, 2, 4, 0}
            });
    assertThat(hourglassSum).isEqualTo(19);
  }
}
