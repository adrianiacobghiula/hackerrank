package aig.hackerrank.interview_preparation_kit.sorting;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;

/*
https://www.hackerrank.com/challenges/ctci-comparator-sorting
 */
public class SortingComparator {

  @Getter
  @RequiredArgsConstructor
  static class Player {
    private final String name;
    private final int score;
  }

  static class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
      int scoreCompare = Integer.compare(b.score, a.score);
      return scoreCompare != 0 ? scoreCompare : a.name.compareTo(b.name);
    }
  }
}
