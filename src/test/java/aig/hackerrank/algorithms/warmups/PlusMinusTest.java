package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlusMinusTest {

  PlusMinus classUnderTest;
  PrintStream console;

  @BeforeEach
  void init() {
    console = System.out;
    classUnderTest = new PlusMinus();
  }

  @AfterEach
  public void clean() {
    System.setOut(console);
  }

  @Test
  void testPlusMinus() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    classUnderTest.plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
    assertThat(outputStream.toString()).isEqualToIgnoringNewLines(
        "0.500000\n" //
            + "0.333333\n"
            + "0.166667\n");
  }
}
