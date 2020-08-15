package aig.hackerrank.interview_preparation_kit.dictionaries;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RansomNoteTest {

  @Test
  void testCheckMagazineSample0() {
    boolean containsAllWords =
        new RansomNote(
                new String[] {"give", "me", "one", "grand", "today", "night"},
                new String[] {"give", "one", "grand", "today"})
            .containsAllWords();
    assertThat(containsAllWords).isTrue();
  }

  @Test
  void testCheckMagazineSample1() {
    boolean containsAllWords =
        new RansomNote(
                new String[] {"two", "times", "three", "is", "not", "four"},
                new String[] {"two", "times", "two", "is", "four"})
            .containsAllWords();
    assertThat(containsAllWords).isFalse();
  }

  @Test
  void testCheckMagazineSample2() {
    boolean containsAllWords =
        new RansomNote(
                new String[] {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"},
                new String[] {"ive", "got", "some", "coconuts"})
            .containsAllWords();
    assertThat(containsAllWords).isFalse();
  }
}
