package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
 */
public class MinimumAbsoluteDifference {

  int minimumAbsoluteDifference(int[] arr) {
    Arrays.sort(arr);
    int min = Math.abs(arr[1] - arr[0]);
    for (int i = 2; i < arr.length; i++) {
      if (min > Math.abs(arr[i] - arr[i - 1])) {
        min = Math.abs(arr[i] - arr[i - 1]);
      }
    }

    return min;
  }
}
