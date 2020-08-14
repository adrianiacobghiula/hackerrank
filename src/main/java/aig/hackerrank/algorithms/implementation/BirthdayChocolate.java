package aig.hackerrank.algorithms.implementation;

import java.util.List;

/*
https://www.hackerrank.com/challenges/the-birthday-bar
 */
public class BirthdayChocolate {
  public int birthday(List<Integer> s, int d, int m) {
    int sum = 0;
    for (int i = 0; i < m; i++) {
      sum += s.get(i);
    }
    int validCount = sum == d ? 1 : 0;
    for (int i = m; i < s.size(); i++) {
      sum = sum - s.get(i - m) + s.get(i);
      validCount = validCount + (sum == d ? 1 : 0);
    }
    return validCount;
  }
}
