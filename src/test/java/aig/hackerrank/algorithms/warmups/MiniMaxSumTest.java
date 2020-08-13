package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiniMaxSumTest {

  MiniMaxSum classUnderTest;
  PrintStream console;

  @BeforeEach
  void init() {
    console = System.out;
    classUnderTest = new MiniMaxSum();
  }

  @AfterEach
  public void clean() {
    System.setOut(console);
  }

  @Test
  void testMiniMaxSum() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    classUnderTest.miniMaxSum(new int[]{1, 3, 5, 7, 9});
    assertThat(outputStream).hasToString("16 24");
  }
}
