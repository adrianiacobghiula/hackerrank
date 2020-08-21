package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.LinkedList;

/*
https://www.hackerrank.com/challenges/reverse-shuffle-merge
 */
public class ReverseShuffleMerge {

  public static final int MAX_ENGLISH_CHARS = 'z' - 'a' + 1;
  private final String s;
  private final int[] charsInA;
  private final int[] requiredCharsForA;
  private final LinkedList<Integer> partial;
  private final int[] partialRequiredCharsForA;

  int[] usedChars = new int[MAX_ENGLISH_CHARS];

  int currentMinim;

  public ReverseShuffleMerge(String s) {
    this.s = s;
    charsInA = new int[MAX_ENGLISH_CHARS];
    requiredCharsForA = new int[MAX_ENGLISH_CHARS];
    partialRequiredCharsForA = new int[MAX_ENGLISH_CHARS];
    buildCharsInA(s);
    buildRequiredCharsForA();

    System.arraycopy(requiredCharsForA, 0, partialRequiredCharsForA, 0, MAX_ENGLISH_CHARS);
    partial = new LinkedList<>();
    currentMinim = getCurrentMinim(requiredCharsForA, 0);
  }

  String reverseShuffleMerge() {

    StringBuilder result = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; i--) {
      int ch = s.charAt(i) - 'a';
      usedChars[ch]++;
      if (requiredCharsForA[ch] == 0) {
        continue;
      }
      if (currentMinim == MAX_ENGLISH_CHARS) {
        break;
      }

      if (ch == currentMinim) {
        result.append((char) (ch + 'a'));
        requiredCharsForA[ch]--;
        partialRequiredCharsForA[ch]--;
        popPartial(ch);
      } else if (charsInA[ch] - usedChars[ch] < requiredCharsForA[ch]) {
        popPartial(ch);

        while ((!partial.isEmpty()) && (partial.peekFirst() < ch)) {
          int chPartial = partial.removeFirst();

          result.append((char) (chPartial + 'a'));
          requiredCharsForA[chPartial]--;
        }

        if (requiredCharsForA[ch] > 0) {
          result.append((char) (ch + 'a'));
          requiredCharsForA[ch]--;
          partialRequiredCharsForA[ch]--;
        }
      } else if (partialRequiredCharsForA[ch] > 0) {
        popPartial(ch);
        pushPartial(ch);
      }

      if (0 == requiredCharsForA[currentMinim]) {
        currentMinim = getCurrentMinim(requiredCharsForA, currentMinim);
      }
    }

    return result.toString();
  }

  private void pushPartial(int ch) {
    partial.addLast(ch);
    partialRequiredCharsForA[ch]--;
  }

  private void popPartial(int ch) {
    while ((!partial.isEmpty()) && (partial.peekLast() > ch)) {
      int chPartial = partial.removeLast();
      partialRequiredCharsForA[chPartial]++;
    }
  }

  private void buildRequiredCharsForA() {
    for (int i = 0; i < MAX_ENGLISH_CHARS; i++) {
      requiredCharsForA[i] = charsInA[i] / 2;
    }
  }

  private void buildCharsInA(String s) {
    s.chars().forEach(c -> charsInA[c - 'a']++);
  }

  private int getCurrentMinim(int[] requiredCharsInS, int currentMinim) {
    for (int i = currentMinim; i < MAX_ENGLISH_CHARS; i++) {
      if (requiredCharsInS[i] != 0) {
        return i;
      }
    }
    return MAX_ENGLISH_CHARS;
  }
}
