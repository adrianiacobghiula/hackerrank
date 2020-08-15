package aig.hackerrank.algorithms.implementation;

/*
https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */
public class JumpingOnTheClouds {
  public int jumpingOnClouds(int[] c) {
    int jumps = 0;
    int i = 0;
    while (i < c.length - 1) {
      if ((i + 2 < c.length) && (c[i + 2] == 0)) {
        i += 2;
      } else {
        i++;
      }
      jumps++;
    }
    return jumps;
  }
}
