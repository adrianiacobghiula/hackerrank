package aig.hackerrank.algorithms.string;

/*
https://www.hackerrank.com/challenges/strong-password
 */
public class StrongPassword {

  int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    boolean numbers = false;
    boolean lowerCase = false;
    boolean upperCase = false;
    boolean specialCharacters = false;
    for (int i = 0; i < password.length(); i++) {
      char c = password.charAt(i);
      if ('0' <= c && c <= '9') {
        numbers = true;
      }
      if ('a' <= c && c <= 'z') {
        lowerCase = true;
      }
      if ('A' <= c && c <= 'Z') {
        upperCase = true;
      }
      if ("!@#$%^&*()-+".indexOf(c) >= 0) {
        specialCharacters = true;
      }
    }
    int moreToAdd = 0;
    if (!numbers) {
      moreToAdd++;
    }
    if (!lowerCase) {
      moreToAdd++;
    }
    if (!upperCase) {
      moreToAdd++;
    }
    if (!specialCharacters) {
      moreToAdd++;
    }

    return Math.max(6 - password.length(), moreToAdd);
  }
}
