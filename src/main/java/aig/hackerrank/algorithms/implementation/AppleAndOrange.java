package aig.hackerrank.algorithms.implementation;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/apple-and-orange
 */
public class AppleAndOrange {

  int count(int s, int t, int treePos, int[] relativeFruitPositions) {
    return (int)
        Arrays.stream(relativeFruitPositions)
            .map(relativeFruitPosition -> treePos + relativeFruitPosition)
            .filter(absolutionPosition -> s <= absolutionPosition && absolutionPosition <= t)
            .count();
  }

  public void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    System.out.println(count(s, t, a, apples));
    System.out.println(count(s, t, b, oranges));
  }
}
