package aig.hackerrank.interview_preparation_kit.sorting;

public class BubbleSort {
  void countSwaps(int[] a) {
    int numSwaps = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - 1; j++) {
        if (a[j] > a[j + 1]) {
          int s = a[j];
          a[j] = a[j + 1];
          a[j + 1] = s;
          numSwaps++;
        }
      }
    }
    System.out.println("Array is sorted in " + numSwaps + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length - 1]);
  }
}
