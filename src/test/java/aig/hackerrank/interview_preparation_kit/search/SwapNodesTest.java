package aig.hackerrank.interview_preparation_kit.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SwapNodesTest {

  @Test
  void testSample0() {
    SwapNodes classUnderTest = new SwapNodes(new int[][] {{2, 3}, {-1, -1}, {-1, -1}});
    int[][] swapNodes = classUnderTest.swapNodes(new int[] {1, 1});
    assertThat(swapNodes).hasDimensions(2, 3);
    assertThat(swapNodes[0]).containsExactly(3, 1, 2);
    assertThat(swapNodes[1]).containsExactly(2, 1, 3);
  }

  @Test
  void testSample1() {
    SwapNodes classUnderTest =
        new SwapNodes(new int[][] {{2, 3}, {-1, 4}, {-1, 5}, {-1, -1}, {-1, -1}});

    int[][] swapNodes = classUnderTest.swapNodes(new int[] {2});
    assertThat(swapNodes).hasDimensions(1, 5);
    assertThat(swapNodes[0]).containsExactly(4, 2, 1, 5, 3);
  }

  @Test
  void testSample2() {
    SwapNodes classUnderTest =
        new SwapNodes(
            new int[][] {
              {2, 3},
              {4, -1},
              {5, -1},
              {6, -1},
              {7, 8},
              {-1, 9},
              {-1, -1},
              {10, 11},
              {-1, -1},
              {-1, -1},
              {-1, -1}
            });

    int[][] swapNodes = classUnderTest.swapNodes(new int[] {2, 4});
    assertThat(swapNodes).hasDimensions(2, 11);
    assertThat(swapNodes[0]).containsExactly(2, 9, 6, 4, 1, 3, 7, 5, 11, 8, 10);
    assertThat(swapNodes[1]).containsExactly(2, 6, 9, 4, 1, 3, 7, 5, 10, 8, 11);
  }
}
