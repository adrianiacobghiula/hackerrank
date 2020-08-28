package aig.hackerrank.interview_preparation_kit.stacks_and_queues;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BalancedBracketsTest {

  BalancedBrackets classUnderTest = new BalancedBrackets();

  @Test
  void testSample0A() {
    String balanced = classUnderTest.isBalanced("{[()]}");
    assertThat(balanced).isEqualTo("YES");
  }

  @Test
  void testSample0B() {
    String balanced = classUnderTest.isBalanced("{[(])}");
    assertThat(balanced).isEqualTo("NO");
  }

  @Test
  void testSample0C() {
    String balanced = classUnderTest.isBalanced("{{[[(())]]}}");
    assertThat(balanced).isEqualTo("YES");
  }

  @Test
  void testSample1A() {
    String balanced = classUnderTest.isBalanced("{{([])}}");
    assertThat(balanced).isEqualTo("YES");
  }

  @Test
  void testSample1B() {
    String balanced = classUnderTest.isBalanced("{{)[](}}");
    assertThat(balanced).isEqualTo("NO");
  }

  @Test
  void testSample2A() {
    String balanced = classUnderTest.isBalanced("{(([])[])[]}");
    assertThat(balanced).isEqualTo("YES");
  }

  @Test
  void testSample2B() {
    String balanced = classUnderTest.isBalanced("{(([])[])[]]}");
    assertThat(balanced).isEqualTo("NO");
  }

  @Test
  void testSample2C() {
    String balanced = classUnderTest.isBalanced("{(([])[])[]}[]");
    assertThat(balanced).isEqualTo("YES");
  }


}
