package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class JumpingOnTheCloudsTest {
  JumpingOnTheClouds classUnderTest = new JumpingOnTheClouds();

  @Test
  void testJumpingOnCloudsSample0() {
    int jumpingOnClouds = classUnderTest.jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 0});
    assertThat(jumpingOnClouds).isEqualTo(4);
  }
}
