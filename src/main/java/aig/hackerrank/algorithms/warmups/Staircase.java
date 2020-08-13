package aig.hackerrank.algorithms.warmups;

/*
https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {

  void staircase(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = n - i; j <= n; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
