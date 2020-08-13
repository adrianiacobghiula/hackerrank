package aig.hackerrank.algorithms.warmups;

import java.util.Arrays;
import java.util.List;

/*
https://www.hackerrank.com/challenges/compare-the-triplets
 */
public class CompareTheTriplets {

  public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int alice = 0;
    int bob = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        alice++;
      }
      if (a.get(i) < b.get(i)) {
        bob++;
      }
    }

    return Arrays.asList(alice, bob);
  }
}
