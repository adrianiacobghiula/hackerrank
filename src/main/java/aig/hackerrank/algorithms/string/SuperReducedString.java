package aig.hackerrank.algorithms.string;

/*
https://www.hackerrank.com/challenges/reduced-string
 */
public class SuperReducedString {

  public String superReducedString(String s) {
    String previous = s;
    String reduced = reduceString(s);
    while (reduced.length() != previous.length()) {
      previous = reduced;
      reduced = reduceString(previous);
    }

    if (reduced.length() == 0) {
      return "Empty String";
    }
    return reduced;
  }

  private String reduceString(String s) {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    while (i < s.length()) {
      if ((i < s.length() - 1) && (s.charAt(i) == s.charAt(i + 1))) {
        i += 2;
      } else {
        sb.append(s.charAt(i));
        i++;
      }
    }
    return sb.toString();
  }
}
