package aig.hackerrank.algorithms.string;
/*
https://www.hackerrank.com/challenges/camelcase
 */
public class CamelCase {
  int camelcase(String s) {
    return (int) s.chars().filter(c -> 'A' <= c && c <= 'Z').count() + 1;
  }
}
