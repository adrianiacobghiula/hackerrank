package aig.hackerrank.algorithms.implementation;

/*
https://www.hackerrank.com/challenges/kangaroo/
 */
public class Kangaroo {

  public static final String FALSE = "NO";
  public static final String TRUE = "YES";

  String areMeeting(int x1, int v1, int x2, int v2) {
    if (v1 < v2) {
      return FALSE;
    }
    if (v1 == v2) {
      return (x1 == x2) ? TRUE : FALSE;
    }

    if ((x2 - x1) % (v1 - v2) != 0) {
      return FALSE;
    }

    return TRUE;
  }
}
