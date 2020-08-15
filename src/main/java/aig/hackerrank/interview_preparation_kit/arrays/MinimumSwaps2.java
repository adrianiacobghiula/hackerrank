package aig.hackerrank.interview_preparation_kit.arrays;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/*
https://www.hackerrank.com/challenges/minimum-swaps-2
 */
public class MinimumSwaps2 {
  int minimumSwaps(int[] arr) {
    NavigableMap<Integer, Integer> byIndex = new TreeMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (i + 1 != arr[i]) {
        byIndex.put(i + 1, arr[i]);
      }
    }
    int swaps = 0;
    while (!byIndex.isEmpty()) {
      Entry<Integer, Integer> entry = byIndex.pollFirstEntry();
      Set<Integer> cycle = new HashSet<>();
      cycle.add(entry.getKey());
      int next = entry.getValue();
      while (!cycle.contains(next)) {
        cycle.add(next);
        next = byIndex.remove(next);
      }
      swaps += cycle.size() - 1;
    }

    return swaps;
  }
}
