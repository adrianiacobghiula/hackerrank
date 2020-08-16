package aig.hackerrank.interview_preparation_kit.sorting;

import java.util.Comparator;

/*
https://www.hackerrank.com/challenges/ctci-comparator-sorting
 */
public class SortingComparator {

  static class Player {
    String name;
    int score;

    Player(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return name;
    }

    public int getScore() {
      return score;
    }
  }

  static class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
      int scoreCompare = Integer.compare(b.score, a.score);
      return scoreCompare != 0 ? scoreCompare : a.name.compareTo(b.name);
    }
  }
}
