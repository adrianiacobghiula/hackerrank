package aig.hackerrank.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SockMerchantTest {
  SockMerchant classUnderTest = new SockMerchant();

  @Test
  void testSockMerchantSample0() {
    int sockMerchant =
        classUnderTest.sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20});
    assertThat(sockMerchant).isEqualTo(3);
  }
}
