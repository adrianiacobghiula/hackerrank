package aig.hackerrank.interview_preparation_kit.arrays;

/*
https://www.hackerrank.com/challenges/ctci-array-left-rotation
 */
public class ArrayLeftRotation {
  public int[] rotLeft(int[] a, int d) {
    int leftRot = d % a.length;
    int[] r = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      r[i] = a[(i + leftRot) % a.length];
    }
    return r;
  }
}
