package aig.hackerrank.interview_preparation_kit.string_manipulation;

/*
https://www.hackerrank.com/challenges/alternating-characters
 */
public class AlternatingCharacters {

  int countDeletions(String s) {
    if (s.length() == 0) {
      return 0;
    }
    int deletions = 0;
    int prevChar = s.charAt(0);
    for (int i = 1;i<s.length();i++) {
      if (prevChar == s.charAt(i)) {
        deletions++;
      } else {
        prevChar = s.charAt(i);
      }
    }
    return deletions;

  }
}
