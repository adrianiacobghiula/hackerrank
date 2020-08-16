package aig.hackerrank.interview_preparation_kit.sorting;

/*
https://www.hackerrank.com/challenges/ctci-merge-sort
 */
public class CountingInversions {

  long mergeSort(int[] arr, int firstIndex, int lastIndex) {
    if (firstIndex == lastIndex) {
      return 0;
    }
    if (firstIndex + 1 == lastIndex) {
      if (arr[firstIndex] > arr[lastIndex]) {
        int swap = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = swap;
        return 1;
      }
      return 0;
    }

    int middle = (firstIndex + lastIndex) / 2;
    long swaps = mergeSort(arr, firstIndex, middle);
    swaps += mergeSort(arr, middle + 1, lastIndex);

    int[] sorted = new int[lastIndex - firstIndex + 1];
    int sortedIndex = 0;
    int aIdx = firstIndex;
    int bIdx = middle + 1;
    while (aIdx <= middle && bIdx <= lastIndex) {
      if (arr[aIdx] <= arr[bIdx]) {
        sorted[sortedIndex++] = arr[aIdx++];
      } else {
        sorted[sortedIndex++] = arr[bIdx++];
        // all remaining elements in the first part are bigger then current
        swaps += middle - aIdx + 1;
      }
    }
    while (aIdx <= middle) {
      sorted[sortedIndex++] = arr[aIdx++];
    }
    while (bIdx <= lastIndex) {
      sorted[sortedIndex++] = arr[bIdx++];
    }
    System.arraycopy(sorted, 0, arr, firstIndex, sorted.length);
    return swaps;
  }

  long countInversions(int[] arr) {
    return mergeSort(arr, 0, arr.length - 1);
  }
}
