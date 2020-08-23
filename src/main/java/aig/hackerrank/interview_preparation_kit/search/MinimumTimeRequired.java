package aig.hackerrank.interview_preparation_kit.search;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/minimum-time-required
 */
public class MinimumTimeRequired {

  private final long[] timeToProduceOneItemForMachine;

  public MinimumTimeRequired(long[] timeToProduceOneItemForMachine) {
    this.timeToProduceOneItemForMachine = timeToProduceOneItemForMachine;
  }

  long minTime(long goal) {
    long maxTimeToProduceGoal = max(timeToProduceOneItemForMachine) * goal;

    long lowDay = 1;
    long highDay = maxTimeToProduceGoal;

    while (lowDay < highDay) {
      long midDay = (lowDay + highDay) >>> 1;
      long itemsProduced = itemsProducedInDay(midDay);

      if (itemsProduced < goal) {
        lowDay = midDay + 1;
      } else {
        highDay = midDay;
      }
    }
    return lowDay;
  }

  long max(long[] arr) {
    return Arrays.stream(arr).max().orElse(Long.MIN_VALUE);
  }

  long itemsProducedInDay(long day) {
    long items = 0;
    for (long timeToProduceOneItem : timeToProduceOneItemForMachine) {
      items += day / timeToProduceOneItem;
    }
    return items;
  }
}
