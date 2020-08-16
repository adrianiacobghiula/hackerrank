package aig.hackerrank.interview_preparation_kit.sorting;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/mark-and-toys
 */
public class MarkAndToys {
  int maximumToys(int[] prices, int k) {
    Arrays.sort(prices);
    int sum = 0;
    int toys = 0;
    for (int i = 0; i < prices.length && (sum <= k); i++) {
      sum += prices[i];
      if (sum <= k) {
        toys++;
      }
    }
    return toys;
  }
}
