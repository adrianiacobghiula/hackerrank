package aig.hackerrank.interview_preparation_kit.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import aig.hackerrank.interview_preparation_kit.sorting.SortingComparator.Player;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SortingComparatorTest {

  @Test
  void testSortComparatorSample0() {
    Player[] players =
        new Player[] {
          new Player("amy", 100),
          new Player("david", 100),
          new Player("heraldo", 50),
          new Player("aakansha", 75),
          new Player("aleksa", 150)
        };

    Arrays.sort(players, new SortingComparator.Checker());

    assertThat(players)
        .extracting(Player::getName)
        .containsExactly("aleksa", "amy", "david", "aakansha", "heraldo");
  }
}
