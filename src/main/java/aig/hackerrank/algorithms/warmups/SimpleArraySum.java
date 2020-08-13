package aig.hackerrank.algorithms.warmups;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {

  public int simpleArraySum(int[] ar) {
    return Arrays.stream(ar).sum();
  }
}
