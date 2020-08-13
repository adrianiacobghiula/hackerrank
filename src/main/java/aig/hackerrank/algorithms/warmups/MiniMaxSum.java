package aig.hackerrank.algorithms.warmups;

/*
https://www.hackerrank.com/challenges/mini-max-sum
 */
public class MiniMaxSum {

  void miniMaxSum(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    long sum = 0;
    for (int value : arr) {
      if (value > max) {
        max = value;
      }
      if (value < min) {
        min = value;
      }
      sum += value;
    }

    System.out.printf("%d %d", sum - max, sum - min);
  }
}
