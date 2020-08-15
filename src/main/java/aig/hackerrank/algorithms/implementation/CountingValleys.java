package aig.hackerrank.algorithms.implementation;

/*
https://www.hackerrank.com/challenges/counting-valleys
 */
public class CountingValleys {
  public int countingValleys(int n, String s) {
    int level = 0;
    int valleys = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'U') {
        level++;
        if (level == 0) {
          valleys++;
        }
      } else {
        level--;
      }
    }
    return valleys;
  }
}
