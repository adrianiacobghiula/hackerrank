package aig.hackerrank.algorithms.implementation;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.stream.Collectors;

/*
https://www.hackerrank.com/challenges/migratory-birds
 */
public class MigratoryBirds {

  public static class Sighting {
    private final int birdType;
    private final long sightCount;

    public Sighting(int birdType, long sightCount) {
      this.birdType = birdType;
      this.sightCount = sightCount;
    }

    public int getBirdType() {
      return birdType;
    }

    public long getSightCount() {
      return sightCount;
    }
  }

  int mostCommonBird(List<Integer> arr) {
    return arr.stream().collect(groupingBy(t -> t, Collectors.counting())).entrySet().stream()
        .map(e -> new Sighting(e.getKey(), e.getValue()))
        .sorted(
            comparing(Sighting::getSightCount, reverseOrder()).thenComparing(Sighting::getBirdType))
        .map(Sighting::getBirdType)
        .findFirst()
        .orElseThrow(RuntimeException::new);
  }
}
