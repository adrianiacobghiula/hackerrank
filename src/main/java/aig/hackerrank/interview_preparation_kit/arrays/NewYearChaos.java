package aig.hackerrank.interview_preparation_kit.arrays;

/*
https://www.hackerrank.com/challenges/new-year-chaos/problem
 */
public class NewYearChaos {

  public String minimumBribes(int[] q) {
    for (int i = 0; i < q.length - 1; i++) {
      if (q[i] > i + 3) {
        return "Too chaotic";
      }
    }
    int bribes = 0;
    int start = 0;
    for (int j = 0; j < q.length; j++) {
      for (int i = start; i < q.length - j - 1; i++) {
        if (q[i] > q[i + 1]) {
          int swap = q[i];
          q[i] = q[i + 1];
          q[i + 1] = swap;
          bribes++;
        }
        if ((q[i] == i + 1) && (start == i)) {
          start = i + 1;
        }
      }
    }

    return Integer.toString(bribes);
  }
}
