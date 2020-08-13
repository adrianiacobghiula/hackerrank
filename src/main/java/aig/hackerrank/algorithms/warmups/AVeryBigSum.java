package aig.hackerrank.algorithms.warmups;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/a-very-big-sum/
 */
public class AVeryBigSum {

  long aVeryBigSum(long[] ar) {
    return Arrays.stream(ar).sum();
  }
}
