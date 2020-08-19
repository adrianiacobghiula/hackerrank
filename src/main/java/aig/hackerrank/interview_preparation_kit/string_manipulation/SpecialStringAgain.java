package aig.hackerrank.interview_preparation_kit.string_manipulation;

/*
https://www.hackerrank.com/challenges/special-palindrome-again
 */
public class SpecialStringAgain {

  long substrCount(String s) {
    long allCharactersIdenticalCount = allCharactersIdentical(s);
    long allCharactersExceptMiddleCount = allCharactersExceptMiddle(s);
    return allCharactersIdenticalCount + allCharactersExceptMiddleCount;
  }

  private long allCharactersExceptMiddle(String s) {
    long middleIsDiffCount = 0;
    int i = 1;
    while (i < s.length() - 1) {

      char center = s.charAt(i);
      char identity = s.charAt(i - 1);
      int size = 0;
      while (center != identity
          && (0 < i - size)
          && (i + size < s.length() - 1)
          && (s.charAt(i - size - 1) == identity)
          && (s.charAt(i + size + 1) == identity)) {
        size++;
      }
      middleIsDiffCount += size;

      i++;
    }
    return middleIsDiffCount;
  }

  private long allCharactersIdentical(String s) {
    long globalCount = 0;
    int i = 0;
    while (i < s.length()) {
      long length = 1;
      while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        i++;
        length++;
      }
      globalCount += length * (length + 1) / 2;
      i++;
    }
    return globalCount;
  }
}
