package aig.hackerrank.interview_preparation_kit.dictionaries;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CountTripletsTest {

  CountTriplets classUnderTest = new CountTriplets();

  @Test
  void testCountTripletsSample0() {
    long triplets = classUnderTest.countTriplets(Arrays.asList(1L, 2L, 2L, 4L), 2);
    assertThat(triplets).isEqualTo(2);
  }

  @Test
  void testCountTripletsSample1() {
    long triplets = classUnderTest.countTriplets(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3);
    assertThat(triplets).isEqualTo(6);
  }

  @Test
  void testCountTripletsSample2() {
    long triplets = classUnderTest.countTriplets(Arrays.asList(1L, 5L, 5L, 25L, 125L), 5);
    assertThat(triplets).isEqualTo(4);
  }

  @Test
  void testCountTripletsCase2() {
    long triplets =
        classUnderTest.countTriplets(
            Arrays.asList(
                1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L),
            1);
    assertThat(triplets).isEqualTo(161700);
  }

  @Test
  void testCountTripletsMyCase() {
    long triplets = classUnderTest.countTriplets(Arrays.asList(1L, 1L, 1L, 1L, 1L), 1);
    assertThat(triplets).isEqualTo(10L);
  }
}
