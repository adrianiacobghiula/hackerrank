package aig.hackerrank.interview_preparation_kit.string_manipulation;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
/*
https://www.hackerrank.com/challenges/ctci-making-anagrams
 */
public class MakingAnagrams {

  int makeAnagram(String a, String b) {
    Map<Integer, Long> freqA =
        a.chars().boxed().collect(groupingBy(Function.identity(), counting()));
    Map<Integer, Long> freqB =
        b.chars().boxed().collect(groupingBy(Function.identity(), counting()));

    HashSet<Integer> allChars = new HashSet<>();
    allChars.addAll(freqA.keySet());
    allChars.addAll(freqB.keySet());
    int diff = 0;
    for (Integer c : allChars) {
      Long aCharCount = Objects.isNull(freqA.get(c)) ? 0L : freqA.get(c);
      Long bCharCount = Objects.isNull(freqB.get(c)) ? 0L : freqB.get(c);
      diff += Math.abs(aCharCount - bCharCount);
    }
    return diff;
  }
}
