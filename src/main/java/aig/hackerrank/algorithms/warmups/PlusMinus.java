package aig.hackerrank.algorithms.warmups;

import static java.lang.System.out;

/*
https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {

  public static final String FORMAT_OUTPUT = "%.06f%n";

  public void plusMinus(int[] arr) {
    int negative = 0;
    int zero = 0;
    int positive = 0;
    for (int value : arr) {
      if (value < 0) {
        negative++;
      } else if (value == 0) {
        zero++;
      } else {
        positive++;
      }
    }

    out.printf(FORMAT_OUTPUT, (double) positive / arr.length);
    out.printf(FORMAT_OUTPUT, (double) negative / arr.length);
    out.printf(FORMAT_OUTPUT, (double) zero / arr.length);
  }
}
