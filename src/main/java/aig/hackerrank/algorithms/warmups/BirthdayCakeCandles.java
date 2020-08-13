package aig.hackerrank.algorithms.warmups;

/*
https://www.hackerrank.com/challenges/birthday-cake-candles
 */
public class BirthdayCakeCandles {

  public int birthdayCakeCandles(int[] ar) {

    int max = Integer.MIN_VALUE;
    int count = 0;
    for (int value : ar) {
      if (value > max) {
        max = value;
        count = 1;
      } else if (value == max) {
        count++;
      }
    }
    return count;
  }
}
