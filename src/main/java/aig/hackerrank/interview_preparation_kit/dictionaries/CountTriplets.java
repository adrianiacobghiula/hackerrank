package aig.hackerrank.interview_preparation_kit.dictionaries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.LongAdder;

/*
https://www.hackerrank.com/challenges/count-triplets-1
 */
public class CountTriplets {
  long countTriplets(List<Long> arr, long r) {

    Map<Long, LongAdder> step1Side = new HashMap<>();
    Map<Long, LongAdder> step3Side = new HashMap<>();
    for (int i = 1; i < arr.size(); i++) {
      Long key = arr.get(i);
      addToSide(step3Side, key);
    }

    long triplets = 0;
    // compute from the j perspective and remember number frequency before and after j
    for (int j = 1; j < arr.size(); j++) {
      addToSide(step1Side, arr.get(j - 1));
      Long step2Key = arr.get(j);
      removeToSide(step3Side, step2Key);

      if (step2Key % r != 0) {
        continue;
      }
      long step1Key = step2Key / r;
      if (Objects.isNull(step1Side.get(step1Key))) {
        continue;
      }
      long step3Key = step2Key * r;
      if (Objects.isNull(step3Side.get(step3Key))) {
        continue;
      }

      long step1Size = step1Side.get(step1Key).longValue();
      long step3Size = step3Side.get(step3Key).longValue();

      triplets += step1Size * step3Size;
    }

    return triplets;
  }

  private void addToSide(Map<Long, LongAdder> stepSide, Long key) {
    stepSide.putIfAbsent(key, new LongAdder());
    stepSide.get(key).increment();
  }

  private void removeToSide(Map<Long, LongAdder> stepSide, Long key) {
    LongAdder frequency = stepSide.get(key);
    if (Objects.isNull(frequency)) {
      return;
    }
    frequency.decrement();
    if (frequency.intValue() == 0) {
      stepSide.remove(key);
    }
  }
}
