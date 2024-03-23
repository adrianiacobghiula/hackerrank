package aig.hackerrank.interview_preparation_kit.dynamic_programming;

import java.util.HashSet;
import java.util.Set;

/*
https://www.hackerrank.com/challenges/abbr/problem
 */
public class Abbreviation {

  Set<String> negative = new HashSet<>();

  public String abbreviation(String a, String b) {
    return abbreviation(a, b, 0, 0) ? "YES" : "NO";
  }

  public boolean abbreviation(String a, String b, int sa, int sb) {
    if (a.length() - sa < b.length() - sb) {
      return false;
    }
    if (sa == a.length()) {
      return sb == b.length();
    }
    String sub = a.substring(sa) + "$" + b.substring(sb);
    char ac = a.charAt(sa);
    if (ac == Character.toUpperCase(ac)) {
      if (sb == b.length()) {
        return false;
      }
      char bc = b.charAt(sb);
      if (bc != ac) {
        return false;
      }
      return r(abbreviation(a, b, sa + 1, sb + 1), sub);
    } else {
      if (negative.contains(sub)) {
        return false;
      }

      if (sb == b.length()) {
        return r(abbreviation(a, b, sa + 1, sb), sub);
      }
      char bc = b.charAt(sb);
      if (bc == Character.toUpperCase(ac)) {
        if (r(abbreviation(a, b, sa + 1, sb + 1), sub)) {
          return true;
        }
      }
      return r(abbreviation(a, b, sa + 1, sb), sub);
    }
  }

  private boolean r(boolean b, String sub) {
    if (!b) {
      negative.add(sub);
    }
    return b;
  }

}
