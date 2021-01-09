package aig.hackerrank.interview_preparation_kit.stacks_and_queues;

import static java.util.Objects.isNull;

import java.util.Deque;
import java.util.LinkedList;

/*
https://www.hackerrank.com/challenges/largest-rectangle
 */
public class LargestRectangle {
  public long largestRectangle(int[] heights) {
    Deque<Integer> growingIndexes = new LinkedList<>();

    int maxArea = Integer.MIN_VALUE;
    int h = 0;
    while (h < heights.length || !growingIndexes.isEmpty()) {
      // add in growingIndexes only if current height is bigger or equal that the last in the
      // growingIndexes
      if ((h < heights.length)
          && (growingIndexes.isEmpty() || heights[growingIndexes.peekLast()] <= heights[h])) {
        growingIndexes.addLast(h);
        h++;
      } else {
        // current height is smaller than the last in the growingIndexes
        int lastIndex = growingIndexes.removeLast();
        int distance = isNull(growingIndexes.peekLast()) ? h : h - growingIndexes.peekLast() - 1;
        int area = heights[lastIndex] * distance;
        if (area > maxArea) {
          maxArea = area;
        }
      }
    }

    return maxArea;
  }
}
