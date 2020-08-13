package aig.hackerrank.algorithms.warmups;

import java.time.format.DateTimeFormatter;

/*
https://www.hackerrank.com/challenges/time-conversion
 */
public class TimeConversion {

  String timeConversion(String amPmTime) {
    return DateTimeFormatter.ISO_TIME
        .format(DateTimeFormatter.ofPattern("hh:mm:ssa").parse(amPmTime));
  }
}
