package aig.hackerrank.interview_preparation_kit.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IceCreamParlorTest {

  @Test
  void testExample0() {
    IceCreamParlor icp = new IceCreamParlor(new int[] {1, 4, 5, 3, 2}, 4);
    icp.searchWithSkip();
    assertThat(icp.getSmallIndex()).isEqualTo(1);
    assertThat(icp.getLargeIndex()).isEqualTo(4);
  }

  @Test
  void testExample1() {
    IceCreamParlor icp = new IceCreamParlor(new int[] {2, 2, 4, 3}, 4);
    icp.searchWithSkip();
    assertThat(icp.getSmallIndex()).isEqualTo(1);
    assertThat(icp.getLargeIndex()).isEqualTo(2);
  }

  @Test
  void testExampleWithBinary0() {
    IceCreamParlor icp = new IceCreamParlor(new int[] {1, 4, 5, 3, 2}, 4);
    icp.searchWithBinarySearch();
    assertThat(icp.getSmallIndex()).isEqualTo(1);
    assertThat(icp.getLargeIndex()).isEqualTo(4);
  }

  @Test
  void testExampleWithBinary1() {
    IceCreamParlor icp = new IceCreamParlor(new int[] {2, 2, 4, 3}, 4);
    icp.searchWithBinarySearch();
    assertThat(icp.getSmallIndex()).isEqualTo(1);
    assertThat(icp.getLargeIndex()).isEqualTo(2);
  }
}
