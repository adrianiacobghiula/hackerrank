package aig.hackerrank.algorithms.implementation;

/*
https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class DivisibleSumPairs {
  int divisibleSumPairs(int n, int k, int[] ar) {
    int cnt = 0;
    for (int i = 0; i < ar.length - 1; i++) {
      for (int j = i + 1; j < ar.length; j++) {
        if ((ar[i] + ar[j]) % k == 0) {
          cnt++;
        }
      }
    }
    return cnt;
  }
}
