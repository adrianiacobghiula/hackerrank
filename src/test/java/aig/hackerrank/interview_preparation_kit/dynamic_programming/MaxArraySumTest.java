package aig.hackerrank.interview_preparation_kit.dynamic_programming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxArraySumTest {

  MaxArraySum classUnderTest = new MaxArraySum();

  @ParameterizedTest
  @MethodSource("exampleStream")
  void testSample0(int[] input, int expected) {
    int max = classUnderTest.maxSubsetSum(input);
    assertThat(max).isEqualTo(expected);
  }

  private static Stream<Arguments> exampleStream() {
    return Stream.of(
        Arguments.of(new int[] {-2, 1, 3, -4, 5}, 8),
        Arguments.of(new int[] {-2, -3, -4}, 0),
        Arguments.of(new int[] {3, 7, 4, 6, 5}, 13),
        Arguments.of(new int[] {3, 5, -7, 8, 10}, 15),
        Arguments.of(new int[] {1}, 1),
        Arguments.of(new int[] {-1}, 0),
        Arguments.of(new int[] {1, 4}, 4),
        Arguments.of(new int[] {-1, -4}, 0),
        Arguments.of(new int[] {1, -2}, 1),
        Arguments.of(new int[] {1, 2, -3}, 2),
        Arguments.of(new int[] {1, -2}, 1),
        Arguments.of(new int[] {1, -10, 5, 100}, 101));
  }
}
