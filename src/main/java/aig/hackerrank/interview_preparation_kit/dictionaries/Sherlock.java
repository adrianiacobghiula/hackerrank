package aig.hackerrank.interview_preparation_kit.dictionaries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.LongAdder;

/*
https://www.hackerrank.com/challenges/sherlock-and-anagrams
 */
public class Sherlock {

  static class Anagram {
    private final byte[] letterCount;
    private final int hashCode;

    Anagram(byte[] letterCount) {
      this.letterCount = letterCount;
      hashCode = Arrays.hashCode(letterCount);
    }

    Anagram(Anagram lc, byte firstByte, byte lastByte) {
      byte[] nlc = Arrays.copyOf(lc.letterCount, lc.letterCount.length);
      nlc[firstByte]--;
      nlc[lastByte]++;
      this.letterCount = nlc;
      hashCode = Arrays.hashCode(letterCount);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Anagram)) {
        return false;
      }
      Anagram anagram = (Anagram) o;
      return Arrays.equals(letterCount, anagram.letterCount);
    }

    @Override
    public int hashCode() {
      return hashCode;
    }
  }

  int anagramsCount(String s) {

    byte[] sBytes = stringAsBytes(s);

    int count = 0;

    for (int l = 1; l < sBytes.length; l++) {

      Map<Anagram, LongAdder> anagramCounters = new HashMap<>();

      Anagram nlc = firstSubstring(sBytes, l);
      addOrIncrementAnagram(anagramCounters, nlc);

      for (int i = 1; i < s.length() - l + 1; i++) {
        nlc = new Anagram(nlc, sBytes[i - 1], sBytes[i + l - 1]);
        addOrIncrementAnagram(anagramCounters, nlc);
      }

      for (LongAdder la : anagramCounters.values()) {
        int anagramCount = la.intValue();
        if (anagramCount > 1) {
          count += (anagramCount) * (anagramCount - 1) / 2;
        }
      }
    }
    return count;
  }

  private void addOrIncrementAnagram(Map<Anagram, LongAdder> anagramCounters, Anagram nlc) {
    LongAdder longAdder = anagramCounters.get(nlc);
    if (Objects.isNull(longAdder)) {
      longAdder = new LongAdder();
      anagramCounters.put(nlc, longAdder);
    }
    longAdder.increment();
  }

  private byte[] stringAsBytes(String s) {
    byte[] sBytes = s.getBytes();
    for (int i = 0; i < sBytes.length; i++) {
      sBytes[i] -= 'a';
    }
    return sBytes;
  }

  private Anagram firstSubstring(byte[] sBytes, int l) {
    byte[] lc = new byte[26];
    for (int i = 0; i < l; i++) {
      lc[sBytes[i]]++;
    }
    return new Anagram(lc);
  }
}
