package aig.hackerrank.interview_preparation_kit.search;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
https://www.hackerrank.com/challenges/maximum-subarray-sum/
 */
public class MaximumSubarraySum {

  long maximumSum(long[] a, long m) {

    /*
    One can easily have the sum of all numbers up until that point in the array from position 0 to "currentPos"
    For other sums to be computed one can do: sumOfCurrentPos - sumOfPreviousPosition
    -> a) sumOfCurrentPos >= sumOfPreviousPosition => (sumOfCurrentPos - sumOfPreviousPosition) % M will never be improved
       b) sumOfCurrentPos < sumOfPreviousPosition => become (M + sumOfCurrentPos - sumOfPreviousPosition) % M could improve

       basically one has to remember all previous sums in a sorted way
       and search for the smallest sum but bigger than the current
     */

    NavigableSet<Long> sums = new TreeSet<>();
    long max = Long.MIN_VALUE;
    long currentSum = 0;
    for (long value : a) {
      currentSum = (currentSum + value) % m;
      if (max < currentSum) {
        max = currentSum;
      }
      sums.add(currentSum);

      NavigableSet<Long> biggerThanSum = sums.tailSet(currentSum, false);
      if (!biggerThanSum.isEmpty()) {
        Long smallestSumBiggerThanCurrent = biggerThanSum.first();
        long betterThanCurrentSum = (currentSum - smallestSumBiggerThanCurrent + m) % m;
        if (max < betterThanCurrentSum) {
          max = betterThanCurrentSum;
        }
      }
    }

    return max;
  }
}
