package aig.hackerrank.interview_preparation_kit.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
  BubbleSort classUnderTest = new BubbleSort();
  PrintStream console;

  @BeforeEach
  void init() {
    console = System.out;
  }

  @AfterEach
  public void clean() {
    System.setOut(console);
  }

  @Test
  void testCountSwapsSample0() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    classUnderTest.countSwaps(new int[] {1, 2, 3});
    assertThat(outputStream.toString())
        .isEqualToIgnoringNewLines(
            "Array is sorted in 0 swaps.\n" + "First Element: 1\n" + "Last Element: 3\n");
  }

  @Test
  void testCountSwapsSample1() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    classUnderTest.countSwaps(new int[] {3, 2, 1});
    assertThat(outputStream.toString())
        .isEqualToIgnoringNewLines(
            "Array is sorted in 3 swaps.\n" + "First Element: 1\n" + "Last Element: 3\n");
  }
}
