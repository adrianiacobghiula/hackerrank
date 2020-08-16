package aig.hackerrank.interview_preparation_kit.sorting;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/fraudulent-activity-notifications
 */
public class FraudulentActivityNotifications {

  int countNotifications(int[] expenditure, int d) {

    int[] trailingExpenditures = Arrays.copyOf(expenditure, d);
    Arrays.sort(trailingExpenditures);

    int notifications = 0;
    for (int i = d; i < expenditure.length; i++) {
      int median = computeMedian(trailingExpenditures);
      if (expenditure[i] >= median) {
        notifications++;
      }

      removeAndAdd(trailingExpenditures, expenditure[i - d], expenditure[i]);
    }
    return notifications;
  }

  void removeAndAdd(int[] arr, int oldElement, int newElement) {
    if (oldElement == newElement) {
      return;
    }

    int oldPos = Arrays.binarySearch(arr, oldElement);
    int newPos = Arrays.binarySearch(arr, newElement);

    newPos = (newPos < 0) ? -newPos - 1 : newPos;
    if (oldPos < newPos) {
      System.arraycopy(arr, oldPos + 1, arr, oldPos, newPos - 1 - oldPos);
      arr[newPos - 1] = newElement;

    } else if (oldPos > newPos) {
      System.arraycopy(arr, newPos, arr, newPos + 1, oldPos - newPos);
      arr[newPos] = newElement;
    }
  }

  private int computeMedian(int[] arr) {
    if (arr.length % 2 == 1) {
      return arr[arr.length / 2] * 2;
    }
    return (arr[arr.length / 2 - 1] + arr[arr.length / 2]);
  }
}
