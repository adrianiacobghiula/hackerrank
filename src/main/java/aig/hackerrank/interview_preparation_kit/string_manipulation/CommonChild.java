package aig.hackerrank.interview_preparation_kit.string_manipulation;

/*
https://www.hackerrank.com/challenges/common-child
 */
public class CommonChild {
  int commonChild(String s1, String s2) {
    int[] prev = new int[s2.length()];
    int[] current = new int[s2.length()];
    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
        boolean identicalChars = s1.charAt(i) == s2.charAt(j);
        if (j == 0) {
          current[j] = identicalChars ? 1 : 0;
        } else {
          current[j] = identicalChars ? prev[j - 1] + 1 : Math.max(prev[j], current[j - 1]);
        }
      }
      System.arraycopy(current, 0, prev, 0, s2.length());
    }

    return current[s1.length() - 1];
  }
}
