package aig.hackerrank.algorithms.implementation;

import java.util.List;

/*
https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BetweenTwoSets {

  public long greatestCommonDivisor(long a, long b) {
    if (a < b) {
      return greatestCommonDivisor(b, a);
    }
    if (b == 0) {
      return a;
    }
    return greatestCommonDivisor(b, a % b);
  }

  public long greatestCommonDivisor(List<Integer> b) {
    long div = b.get(0);
    for (Integer value : b) {
      div = greatestCommonDivisor(div, value);
    }
    return div;
  }

  public long leastCommonDenominator(long a, long b) {
    return a * b / greatestCommonDivisor(a, b);
  }

  public long leastCommonDenominator(List<Integer> a) {
    long lcd = a.get(0);
    for (Integer value : a) {
      lcd = leastCommonDenominator(lcd, value);
    }
    return lcd;
  }

  private int countDivisors(long n) {
    int cnt = 1;
    long nr = n;
    int div = 2;
    while (nr > 1) {
      int power = 0;
      while (nr % div == 0) {
        nr = nr / div;
        power++;
      }
      cnt = cnt * (power + 1);
      div++;
    }
    return cnt;
  }

  public int getTotalX(List<Integer> a, List<Integer> b) {
    if (a.isEmpty() || b.isEmpty()) {
      return 0;
    }
    long div = greatestCommonDivisor(b);
    long lcd = leastCommonDenominator(a);
    if (div % lcd != 0) {
      return 0;
    }
    return countDivisors(div / lcd);
  }
}
