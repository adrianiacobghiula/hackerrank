package aig.hackerrank.interview_preparation_kit.dictionaries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.LongAdder;

/*
https://www.hackerrank.com/challenges/frequency-queries
 */
public class FrequencyQueries {

  private final List<List<Integer>> queries;
  private final Map<Integer, LongAdder> keyCounter;
  private final Map<Integer, Set<Integer>> frequencyOfKey;

  public FrequencyQueries(List<List<Integer>> queries) {
    this.queries = queries;
    keyCounter = new HashMap<>();
    frequencyOfKey = new HashMap<>();
  }

  private void insert(int key) {
    LongAdder frequency = keyCounter.get(key);
    if (Objects.isNull(frequency)) {
      frequency = new LongAdder();
      keyCounter.put(key, frequency);
    }

    int prevFrequency = frequency.intValue();
    frequency.increment();
    int nextFrequency = frequency.intValue();

    updateFrequencyOfKey(key, prevFrequency, nextFrequency);
  }

  private void remove(int key) {
    LongAdder frequency = keyCounter.get(key);
    if (Objects.isNull(frequency)) {
      return;
    }
    int prevFrequency = frequency.intValue();
    frequency.decrement();
    int nextFrequency = frequency.intValue();

    if (nextFrequency == 0) {
      keyCounter.remove(key);
    }
    updateFrequencyOfKey(key, prevFrequency, nextFrequency);
  }

  private void updateFrequencyOfKey(int key, int prevFrequency, int nextFrequency) {
    Set<Integer> prevKeys = frequencyOfKey.get(prevFrequency);
    if (Objects.nonNull(prevKeys)) {
      prevKeys.remove(key);
      if (prevKeys.isEmpty()) {
        frequencyOfKey.remove(prevFrequency);
      }
    }

    if (nextFrequency == 0) {
      return;
    }

    Set<Integer> nextKeys = frequencyOfKey.get(nextFrequency);
    if (Objects.isNull(nextKeys)) {
      nextKeys = new HashSet<>();
      frequencyOfKey.put(nextFrequency, nextKeys);
    }
    nextKeys.add(key);
  }

  int query(int key) {
    return frequencyOfKey.containsKey(key) ? 1 : 0;
  }

  List<Integer> freqQuery() {
    List<Integer> answers = new ArrayList<>();
    for (List<Integer> operation : queries) {
      switch (operation.get(0)) {
        case 1:
          insert(operation.get(1));
          break;
        case 2:
          remove(operation.get(1));
          break;
        default:
          answers.add(query(operation.get(1)));
      }
    }
    return answers;
  }
}
