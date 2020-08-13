package aig.hackerrank.algorithms.warmups;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaircaseTest {

  Staircase classUnderTest;
  PrintStream console;

  @BeforeEach
  void init() {
    console = System.out;
    classUnderTest = new Staircase();
  }

  @AfterEach
  public void clean() {
    System.setOut(console);
  }

  @Test
  void testStaircase() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    classUnderTest.staircase(6);
    assertThat(outputStream.toString())
        .isEqualToIgnoringNewLines(
            "     #\n" //
                + "    ##\n"
                + "   ###\n"
                + "  ####\n"
                + " #####\n"
                + "######\n");
  }
}
