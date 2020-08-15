package aig.hackerrank.algorithms.implementation;

import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
https://www.hackerrank.com/challenges/sock-merchant
 */
public class SockMerchant {
  int sockMerchant(int n, int[] ar) {
    return Arrays.stream(ar)
        .boxed()
        .collect(groupingBy(t -> t, Collectors.counting()))
        .values()
        .stream()
        .map(aLong -> aLong / 2)
        .mapToInt(Long::intValue)
        .sum();
  }
}
