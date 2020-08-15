package aig.hackerrank.interview_preparation_kit.arrays;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.LongAdder;

/*
https://www.hackerrank.com/challenges/crush
 */
public class ArrayManipulation {

  public long maxValue(int[][] queries) {

    NavigableMap<Integer, LongAdder> openPositionValues = new TreeMap<>();
    NavigableMap<Integer, LongAdder> closePositionValues = new TreeMap<>();
    for (int[] query : queries) {
      // assert a < b
      int a = query[0];
      int b = query[1];
      int k = query[2];
      openPositionValues.putIfAbsent(a, new LongAdder());
      openPositionValues.get(a).add(k);
      closePositionValues.putIfAbsent(b, new LongAdder());
      closePositionValues.get(b).add(k);
    }

    long currentValue = 0;
    long max = Long.MIN_VALUE;
    while (!openPositionValues.isEmpty()) {
      if (openPositionValues.firstEntry().getKey() <= closePositionValues.firstEntry().getKey()) {
        Entry<Integer, LongAdder> openPosition = openPositionValues.pollFirstEntry();
        currentValue += openPosition.getValue().longValue();
        if (max < currentValue) {
          max = currentValue;
        }
      } else {
        Entry<Integer, LongAdder> closedPosition = closePositionValues.pollFirstEntry();
        currentValue -= closedPosition.getValue().longValue();
      }
    }

    return max;
  }
}
