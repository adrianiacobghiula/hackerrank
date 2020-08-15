package aig.hackerrank.interview_preparation_kit.dictionaries;

import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

  String hasCommonSubstrings(String s1, String s2) {

    Set<Integer> s1Chars = s1.chars().boxed().collect(Collectors.toSet());

    OptionalInt first = s2.chars().filter(s1Chars::contains).findFirst();

    return first.isPresent() ? "YES" : "NO";
  }
}
