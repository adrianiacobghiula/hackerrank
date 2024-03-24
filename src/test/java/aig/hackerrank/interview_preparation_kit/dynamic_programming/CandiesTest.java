package aig.hackerrank.interview_preparation_kit.dynamic_programming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CandiesTest {

  Candies classUnderTest = new Candies();

  @ParameterizedTest
  @MethodSource("exampleStream")
  void testSample0(List<Integer> arr, long expected) {
    long answer = classUnderTest.candies(arr.size(), arr);
    assertThat(answer).isEqualTo(expected);
  }

  private static Stream<Arguments> exampleStream() {
    return Stream.of(
        Arguments.of(List.of(4), 1L),
        Arguments.of(List.of(4, 3, 2, 1), 10L),
        Arguments.of(List.of(4, 3, 2, 1, 2), 12L),
        Arguments.of(List.of(4, 6, 4, 5, 6, 2), 10L),
        Arguments.of(List.of(2, 2, 2, 2), 4L),
        Arguments.of(List.of(2, 4, 5, 5, 5), 8L),
        Arguments.of(List.of(1, 2, 2), 4L),
        Arguments.of(List.of(2, 4, 2, 6, 1, 7, 8, 9, 2, 1), 19L),
        Arguments.of(List.of(2, 4, 3, 5, 2, 6, 4, 5), 12L),
        Arguments.of(List.of(7, 2, 3, 2, 1), 9L),
        Arguments.of(List.of(7, 2, 3, 3, 1), 8L));
  }
}
