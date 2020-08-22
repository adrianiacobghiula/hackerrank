package aig.hackerrank.interview_preparation_kit.search;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/triple-sum
 */
public class TripleSum {
  long triplets(int[] a, int[] b, int[] c) {
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    int[] ad = distinct(a);
    int[] bd = distinct(b);
    int[] cd = distinct(c);
    long triplets = 0;
    for (int i = bd.length - 1; 0 <= i; i--) {
      int q = bd[i];
      long pElementsCount = nrOfElements(ad, q);
      long rElementsCount = nrOfElements(cd, q);
      if (pElementsCount == 0 || rElementsCount == 0) {
        break;
      }
      triplets += pElementsCount * rElementsCount;
    }
    return triplets;
  }

  private int[] distinct(int[] a) {
    int[] dArr = new int[a.length];
    int dIdx = 0;
    dArr[dIdx] = a[0];
    for (int el : a) {
      if (dArr[dIdx] != el) {
        dIdx++;
        dArr[dIdx] = el;
      }
    }
    return Arrays.copyOf(dArr, dIdx + 1);
  }

  private int nrOfElements(int[] arr, int q) {
    int pIdx = Arrays.binarySearch(arr, q);
    if (pIdx < 0) {
      return -pIdx - 1;
    }
    while (pIdx < arr.length - 1 && arr[pIdx + 1] == q) {
      pIdx++;
    }
    return pIdx + 1;
  }
}
