package aig.hackerrank.interview_preparation_kit.dynamic_programming;

import java.util.List;

/*
https://www.hackerrank.com/challenges/candies/problem
 */
public class Candies {

  public long candies(int n, List<Integer> arr) {
    long allCandies = 0;
    long peakCandies = 0;
    int i = 0;
    while (i < arr.size()) {
      // decreasing elements
      int minPos = i;
      while (minPos < arr.size() - 1 && arr.get(minPos) > arr.get(minPos + 1)) {
        minPos++;
      }
      //first one must receive the most number of candies
      long startCandies = (minPos - i);
      if (startCandies > 0) {
        allCandies = allCandies + (startCandies + 1) * (startCandies + 2) / 2 - 1;

        //previous peak
        if (i > 0//
            && arr.get(i - 1) > arr.get(i) //
            && peakCandies < startCandies + 2) {
          allCandies = allCandies - peakCandies + startCandies + 2;
        }
      }

      int maxPos = minPos;
      while (maxPos < arr.size() - 1 && arr.get(maxPos) < arr.get(maxPos + 1)) {
        maxPos++;
      }
      peakCandies = (maxPos - minPos) + 1;
      allCandies = allCandies + peakCandies * (peakCandies + 1) / 2;
      i = maxPos + 1;
    }

    return allCandies;
  }

}
