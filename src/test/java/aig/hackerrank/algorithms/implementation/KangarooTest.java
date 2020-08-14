package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KangarooTest {
  Kangaroo classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new Kangaroo();
  }

  @Test
  void testMeeting() {
    String doTheyMeet = classUnderTest.areMeeting(0, 2, 5, 3);
    assertThat(doTheyMeet).isEqualTo(Kangaroo.FALSE);
  }

  @Test
  void testMeeting2() {
    String doTheyMeet = classUnderTest.areMeeting(0, 3, 4, 2);
    assertThat(doTheyMeet).isEqualTo(Kangaroo.TRUE);
  }
}
