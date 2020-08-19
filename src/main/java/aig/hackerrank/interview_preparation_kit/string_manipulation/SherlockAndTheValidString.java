package aig.hackerrank.interview_preparation_kit.string_manipulation;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

/*
https://www.hackerrank.com/challenges/sherlock-and-valid-string
 */
public class SherlockAndTheValidString {
  String isValid(String s) {
    Map<Long, Long> charCountByFreqCount =
        s
            .chars()
            .boxed() //
            .collect(groupingBy(Function.identity(), counting()))
            .entrySet()
            .stream()
            .collect(groupingBy(Entry::getValue, counting()));

    if (charCountByFreqCount.size() == 1) {
      return "YES";
    }

    if (charCountByFreqCount.size() != 2) {
      return "NO";
    }

    Long[] freqCount = charCountByFreqCount.keySet().toArray(new Long[0]);
    Long charCount0 = charCountByFreqCount.get(freqCount[0]);
    Long charCount1 = charCountByFreqCount.get(freqCount[1]);

    if ((charCount0 == 1) && (freqCount[0] == 1)) {
      return "YES";
    }
    if ((charCount1 == 1) && (freqCount[1] == 1)) {
      return "YES";
    }

    if ((charCount0 == 1) && (freqCount[0] == freqCount[1] + 1)) {
      return "YES";
    }
    if ((charCount1 == 1) && (freqCount[1] == freqCount[0] + 1)) {
      return "YES";
    }

    return "NO";
  }
}
