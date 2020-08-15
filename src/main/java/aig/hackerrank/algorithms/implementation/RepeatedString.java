package aig.hackerrank.algorithms.implementation;

/*
https://www.hackerrank.com/challenges/repeated-string
 */
public class RepeatedString {
  long repeatedString(String s, long n) {
    long times = n / s.length();
    int rest = (int) (n % s.length());

    int allAs = 0;
    int lastAs = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        allAs++;
        if (i < rest) {
          lastAs++;
        }
      }
    }
    return allAs * times + lastAs;
  }
}
