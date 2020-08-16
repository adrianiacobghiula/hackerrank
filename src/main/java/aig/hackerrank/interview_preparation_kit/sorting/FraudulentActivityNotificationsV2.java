package aig.hackerrank.interview_preparation_kit.sorting;

/*
https://www.hackerrank.com/challenges/fraudulent-activity-notifications
 */
public class FraudulentActivityNotificationsV2 {

  int countNotifications(int[] expenditure, int d) {
    //use the constraint that expenditure[i] <= 200
    int[] trailingExpenditures = new int[201];
    for (int i = 0; i < d; i++) {
      trailingExpenditures[expenditure[i]]++;
    }

    int notifications = 0;
    for (int i = d; i < expenditure.length; i++) {
      int median = computeMedian(trailingExpenditures, d);
      if (expenditure[i] >= median) {
        notifications++;
      }

      trailingExpenditures[expenditure[i - d]]--;
      trailingExpenditures[expenditure[i]]++;
    }
    return notifications;
  }

  private int computeMedian(int[] trailingExpenditures, int d) {

    int searchedIdx1 = (d % 2 == 1) ? d / 2 : d / 2 - 1;
    int searchedIdx2 = d / 2;

    int idx1 = 0;
    int idx2 = 0;
    int idxSum = 0;
    for (int i = 0; i < trailingExpenditures.length; i++) {
      if (0 == trailingExpenditures[i]) {
        continue;
      }

      if ((idxSum <= searchedIdx1) && (searchedIdx1 < idxSum + trailingExpenditures[i])) {
        idx1 = i;
      }
      if ((idxSum <= searchedIdx2) && (searchedIdx2 < idxSum + trailingExpenditures[i])) {
        idx2 = i;
        break;
      }
      idxSum += trailingExpenditures[i];
    }

    return idx1 + idx2;
  }
}
