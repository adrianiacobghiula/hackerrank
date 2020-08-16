package aig.hackerrank.interview_preparation_kit.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.InputStream;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class FraudulentActivityNotificationsV2Test {
  FraudulentActivityNotificationsV2 classUnderTest = new FraudulentActivityNotificationsV2();

  @Test
  void testCountNotificationsSample0() {
    int notifications = classUnderTest.countNotifications(new int[] {10, 20, 30, 40, 50}, 3);
    assertThat(notifications).isEqualTo(1);
  }

  @Test
  void testCountNotificationsSample1() {
    int notifications = classUnderTest.countNotifications(new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5}, 5);
    assertThat(notifications).isEqualTo(2);
  }

  @Test
  void testCountNotificationsCase0() {
    int notifications = classUnderTest.countNotifications(new int[] {1, 2, 3, 4, 4}, 4);
    assertThat(notifications).isEqualTo(0);
  }

  @Test
  void testCountNotificationsCase1() {

    int notifications = classUnderTest.countNotifications(readExpenditure(), 10000);
    assertThat(notifications).isEqualTo(633);
  }

  int[] readExpenditure() {
    try (Scanner scanner = new Scanner(case1())) {
      String[] nd = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nd[0]);
      int d = Integer.parseInt(nd[1]);

      int[] expenditure = new int[n];

      String[] expenditureItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < n; i++) {
        expenditure[i] = Integer.parseInt(expenditureItems[i]);
      }
      return expenditure;
    }
  }

  private InputStream case1() {
    return FraudulentActivityNotificationsV2Test.class
        .getClassLoader()
        .getResourceAsStream(
            "aig/hackerrank/interview_preparation_kit/sorting/FraudulentActivityNotificationsCase1.txt");
  }
}
