package aig.hackerrank.algorithms.implementation;

/*
https://www.hackerrank.com/challenges/day-of-the-programmer
 */
public class DayOfTheProgrammer {

  public interface Calendar {
    String day256();
  }

  public static class JulianCalendar implements Calendar {
    private final int year;

    public JulianCalendar(int year) {
      this.year = year;
    }

    private boolean isLeapYear() {
      return year % 4 == 0;
    }

    @Override
    public String day256() {
      if (isLeapYear()) {
        return "12.09." + year;
      }
      return "13.09." + year;
    }
  }

  public static class GregorianCalendar implements Calendar {
    private final int year;

    public GregorianCalendar(int year) {
      this.year = year;
    }

    private boolean isLeapYear() {
      return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    @Override
    public String day256() {
      if (isLeapYear()) {
        return "12.09." + year;
      }
      return "13.09." + year;
    }
  }

  public static class Calendar1918 implements Calendar {

    @Override
    public String day256() {
      return "26.09.1918";
    }
  }

  String dayOfProgrammer(int year) {
    Calendar calendar;
    if (year < 1918) {
      calendar = new JulianCalendar(year);
    } else if (year == 1918) {
      calendar = new Calendar1918();
    } else {
      calendar = new GregorianCalendar(year);
    }
    return calendar.day256();
  }
}
