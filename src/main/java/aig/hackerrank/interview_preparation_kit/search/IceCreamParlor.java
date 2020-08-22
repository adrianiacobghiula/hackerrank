package aig.hackerrank.interview_preparation_kit.search;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/ctci-ice-cream-parlor
 */
public class IceCreamParlor {

  static class CostWithIndex implements Comparable<CostWithIndex> {
    final int cost;
    final int index;

    public CostWithIndex(int cost, int index) {
      this.cost = cost;
      this.index = index;
    }

    @Override
    public int compareTo(CostWithIndex o) {
      return Integer.compare(cost, o.cost);
    }

    @Override
    public String toString() {
      return "{" + "cost=" + cost + ", index=" + index + '}';
    }
  }

  private final int[] cost;
  private final int money;
  private final CostWithIndex[] costWithIndices;
  private int smallIndex;
  private int largeIndex;

  public IceCreamParlor(int[] cost, int money) {
    this.cost = cost;
    this.money = money;
    this.costWithIndices = buildCostWithIndices();
  }

  public int getSmallIndex() {
    return smallIndex;
  }

  public int getLargeIndex() {
    return largeIndex;
  }

  private CostWithIndex[] buildCostWithIndices() {
    CostWithIndex[] costWithIndices = new CostWithIndex[cost.length];
    for (int i = 0; i < cost.length; i++) {
      costWithIndices[i] = new CostWithIndex(cost[i], i + 1);
    }
    Arrays.sort(costWithIndices);
    return costWithIndices;
  }

  public void searchWithSkip() {
    int largePos = costWithIndices.length - 1;
    int smallPos = 0;
    while (smallPos < largePos) {
      int rest = money - costWithIndices[largePos].cost;
      while (costWithIndices[smallPos].cost < rest) {
        smallPos++;
      }
      if (costWithIndices[smallPos].cost == rest) {
        computePositions(largePos, smallPos);
        break;
      }
      largePos--;
    }
  }

  public void searchWithBinarySearch() {
    int largePos = Arrays.binarySearch(costWithIndices, new CostWithIndex(money - 1, -1));
    largePos = (largePos < 0) ? -largePos - 1 : largePos;
    largePos = Math.min(costWithIndices.length - 1, largePos);
    int smallPos = 0;
    while (smallPos < largePos) {
      int rest = money - costWithIndices[largePos].cost;
      smallPos = Arrays.binarySearch(costWithIndices, 0, largePos, new CostWithIndex(rest, -1));
      if (smallPos >= 0) {
        computePositions(largePos, smallPos);
        break;
      } else {
        smallPos = -smallPos - 1;
      }
      largePos--;
    }
  }

  private void computePositions(int largePos, int smallPos) {
    this.smallIndex = Math.min(costWithIndices[smallPos].index, costWithIndices[largePos].index);
    this.largeIndex = Math.max(costWithIndices[smallPos].index, costWithIndices[largePos].index);
  }
}
