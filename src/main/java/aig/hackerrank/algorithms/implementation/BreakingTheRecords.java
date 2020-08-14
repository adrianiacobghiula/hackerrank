package aig.hackerrank.algorithms.implementation;

/*
https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */
public class BreakingTheRecords {

  int[] breakingRecords(int[] scores) {
    int max = scores[0];
    int min = scores[0];
    int brokenMax = 0;
    int brokenMin = 0;
    for (int i = 1; i < scores.length; i++) {
      if (max < scores[i]) {
        brokenMax++;
        max = scores[i];
      }
      if (min > scores[i]) {
        brokenMin++;
        min = scores[i];
      }
    }

    return new int[] {brokenMax, brokenMin};
  }
}
