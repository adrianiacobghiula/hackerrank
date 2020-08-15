package aig.hackerrank.interview_preparation_kit.dictionaries;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SherlockTest {

  Sherlock sherlock = new Sherlock();

  @Test
  void testSample0() {
    int anagrams = sherlock.anagramsCount("abba");
    assertThat(anagrams).isEqualTo(4);
  }

  @Test
  void testSample1() {
    int anagrams = sherlock.anagramsCount("abcd");
    assertThat(anagrams).isEqualTo(0);
  }

  @Test
  void testSample3() {
    int anagrams = sherlock.anagramsCount("ifailuhkqq");
    assertThat(anagrams).isEqualTo(3);
  }

  @Test
  void testSample4() {
    int anagrams = sherlock.anagramsCount("kkkk");
    assertThat(anagrams).isEqualTo(10);
  }
}
