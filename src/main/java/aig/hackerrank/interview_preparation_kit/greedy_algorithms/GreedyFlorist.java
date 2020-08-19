package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/greedy-florist
 */
public class GreedyFlorist {
  int getMinimumCost(int k, int[] c) {
    Arrays.sort(c);
    int cost = 0;
    for (int i = c.length - 1; i >= 0; i--) {
      cost += ((c.length - i - 1) / k + 1) * c[i];
    }
    return cost;
  }
}
