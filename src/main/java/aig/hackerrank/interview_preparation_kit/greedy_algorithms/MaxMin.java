package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/angry-children
 */
public class MaxMin {
  int maxMin(int k, int[] arr) {
    Arrays.sort(arr);
    int unfairness = arr[k - 1] - arr[0];
    for (int i = 0; i <= arr.length - k; i++) {
      if (unfairness > arr[i + k - 1] - arr[i]) {
        unfairness = arr[i + k - 1] - arr[i];
      }
    }
    return unfairness;
  }
}
