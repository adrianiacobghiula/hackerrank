package aig.hackerrank.interview_preparation_kit.dynamic_programming;

/*
https://www.hackerrank.com/challenges/max-array-sum/problem
 */
public class MaxArraySum {
  public int maxSubsetSum(int[] arr) {
    if (arr.length < 4) {
      return max3(safeIndex(arr, 0), safeIndex(arr, 1), safeIndex(arr, 0) + safeIndex(arr, 2));
    }

    int[] max = new int[arr.length];

    max[0] = safeIndex(arr, 0);
    max[1] = safeIndex(arr, 1);
    max[2] = safeIndex(arr, 0) + safeIndex(arr, 2);

    for (int i = 3; i < arr.length; i++) {
      int val = Math.max(arr[i], 0);

      max[i] = max3(max[i - 1], val + max[i - 2], val + max[i - 3]);
    }
    return max[max.length - 1];
  }

  public int safeIndex(int[] arr, int idx) {
    return (idx < 0 || idx >= arr.length) ? 0 : Math.max(arr[idx], 0);
  }

  public int max3(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
  }
}
