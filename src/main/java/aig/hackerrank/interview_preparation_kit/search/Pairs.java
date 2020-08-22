package aig.hackerrank.interview_preparation_kit.search;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.function.Function;

/*
https://www.hackerrank.com/challenges/pairs
 */
public class Pairs {
  int pairs(int k, int[] arr) {
    TreeMap<Integer, Long> nrWithCount =
        Arrays.stream(arr)
            .boxed()
            .collect(groupingBy(Function.identity(), TreeMap::new, counting()));

    Iterator<Integer> lowIt = nrWithCount.navigableKeySet().iterator();
    Iterator<Integer> highIt = nrWithCount.navigableKeySet().iterator();

    long pairsCount = 0;
    int low = lowIt.next();
    int high = highIt.next();
    while (true) {
      int dif = high - low;
      if (dif == k) {
        pairsCount += nrWithCount.get(low) * nrWithCount.get(high);
        if (!highIt.hasNext()) {
          break;
        }
        high = highIt.next();
      }
      if (dif < k) {
        if (!highIt.hasNext()) {
          break;
        }
        high = highIt.next();
      }
      if (dif > k) {
        if (!lowIt.hasNext()) {
          break;
        }
        low = lowIt.next();
      }
    }
    return (int) pairsCount;
  }
}
