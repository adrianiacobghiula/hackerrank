package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BetweenTwoSetsTest {

  BetweenTwoSets classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new BetweenTwoSets();
  }

  @Test
  public void test2ValuesGreatestCommonDivisor() {
    long divisor = classUnderTest.greatestCommonDivisor(48, 18);
    assertThat(divisor).isEqualTo(6);
  }

  @Test
  public void test2ValuesGreatestCommonDivisorZero() {
    long divisor = classUnderTest.greatestCommonDivisor(0, 1);
    assertThat(divisor).isEqualTo(1);
  }

  @Test
  public void test2ValuesGreatestCommonDivisorPrime() {
    long divisor = classUnderTest.greatestCommonDivisor(19, 7);
    assertThat(divisor).isEqualTo(1);
  }

  @Test
  public void testListGreatestCommonDivisor() {
    long divisor = classUnderTest.greatestCommonDivisor(Arrays.asList(16, 32, 96));
    assertThat(divisor).isEqualTo(16);
  }

  @Test
  public void testLeastCommonDenominator1() {
    long commonDenominator = classUnderTest.leastCommonDenominator(2, 4);
    assertThat(commonDenominator).isEqualTo(4);
  }

  @Test
  public void testLeastCommonDenominator2() {
    long commonDenominator = classUnderTest.leastCommonDenominator(21, 14);
    assertThat(commonDenominator).isEqualTo(42);
  }

  @Test
  public void testListLeastCommonDenominator2() {
    long commonDenominator = classUnderTest.leastCommonDenominator(Arrays.asList(21, 14, 4));
    assertThat(commonDenominator).isEqualTo(84);
  }

  @Test
  public void testGetTotalX() {
    int considered = classUnderTest.getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96));
    assertThat(considered).isEqualTo(3);
  }

  @Test
  public void testGetTotalX2() {
    int considered = classUnderTest.getTotalX(Arrays.asList(2, 5), Arrays.asList(16, 32, 96));
    assertThat(considered).isEqualTo(0);
  }

  @Test
  public void testGetTotal3() {
    int considered = classUnderTest.getTotalX(Arrays.asList(2, 16), Arrays.asList(16, 32, 96));
    assertThat(considered).isEqualTo(1);
  }

  @Test
  public void testGetTotal4() {
    int considered =
        classUnderTest.getTotalX(
            Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91),
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    assertThat(considered).isEqualTo(0);
  }
}
