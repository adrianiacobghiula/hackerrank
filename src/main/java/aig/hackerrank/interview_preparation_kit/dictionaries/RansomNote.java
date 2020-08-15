package aig.hackerrank.interview_preparation_kit.dictionaries;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/*
https://www.hackerrank.com/challenges/ctci-ransom-note
 */
public class RansomNote {

  private final Map<String, Long> magazineWordCount;
  private final Map<String, Long> noteWordCount;

  RansomNote(String[] magazine, String[] note) {
    magazineWordCount =
        Arrays.stream(magazine).collect(groupingBy(Function.identity(), counting()));

    noteWordCount = Arrays.stream(note).collect(groupingBy(Function.identity(), counting()));
  }

  private boolean containsWords(String word, Long minimumCount) {
    Long magazineWordCount = this.magazineWordCount.get(word);
    return Objects.nonNull(magazineWordCount) && magazineWordCount >= minimumCount;
  }

  boolean containsAllWords() {
    return noteWordCount.entrySet().stream()
        .allMatch(wc -> containsWords(wc.getKey(), wc.getValue()));
  }

  static void checkMagazine(String[] magazine, String[] note) {
    String answer = new RansomNote(magazine, note).containsAllWords() ? "Yes" : "No";
    System.out.println(answer);
  }
}
