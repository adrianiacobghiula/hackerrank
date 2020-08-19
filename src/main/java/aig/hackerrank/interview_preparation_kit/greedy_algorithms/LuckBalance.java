package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/luck-balance
 */
public class LuckBalance {
  int luckBalance(int k, int[][] contests) {
    int[] importantContests = new int[contests.length];
    int idx = 0;
    int luck = 0;
    for (int[] contest : contests) {
      if (contest[1] == 1) {
        importantContests[idx++] = contest[0];
      } else {
        luck += contest[0];
      }
    }
    Arrays.sort(importantContests, 0, idx);
    for (int i = 0; i < idx; i++) {
      if (i < Math.max(idx - k, 0)) {
        luck -= importantContests[i];
      } else {
        luck += importantContests[i];
      }
    }
    return luck;
  }
}
