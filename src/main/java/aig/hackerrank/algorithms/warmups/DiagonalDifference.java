package aig.hackerrank.algorithms.warmups;

import java.util.List;

/*
https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference {

  public int diagonalDifference(List<List<Integer>> arr) {
    int secondary = arr.size();
    int p = 0;
    int s = 0;
    for (int i = 0; i < arr.size(); i++) {
      p += arr.get(i).get(i);
      s += arr.get(i).get(secondary - i - 1);
    }

    return Math.abs(p - s);
  }
}
