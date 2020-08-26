package aig.hackerrank.interview_preparation_kit.search;

public class MakingCandies {

  private long m;
  private long w;
  private final long p;
  private final long n;
  private long currentCandies = 0;

  public MakingCandies(long m, long w, long p, long n) {
    this.m = Math.max(m, w);
    this.w = Math.min(m, w);
    this.p = p;
    this.n = n;
  }

  long minimumPasses() {
    long passes = 0;
    while (currentCandies < n) {

      checkInvestment();

      long newPasses;
      if (currentCandies < p) {
        long requiredPassesToGetOneP = requiredPasses(currentCandies, m, w, p);
        long maxPasses = requiredPasses(currentCandies, m, w, n);
        newPasses = Math.min(requiredPassesToGetOneP, maxPasses);
      } else {
        newPasses = requiredPasses(currentCandies, m, w, n);
      }
      passes += newPasses;
      try {
        currentCandies += Math.multiplyExact(newPasses, Math.multiplyExact(m, w));
      } catch (ArithmeticException aEx) {
        currentCandies = Long.MAX_VALUE;
      }
    }

    return passes;
  }

  private long requiredPasses(long currentCandies, long m, long w, long requiredCandies) {
    long remainingCandies = requiredCandies - currentCandies;
    try {
      double production = Math.multiplyExact(m, w);
      return (long) Math.ceil(remainingCandies / production);
    } catch (ArithmeticException aEx) {
      return 1;
    }
  }

  private void checkInvestment() {
    long newStuff = currentCandies / p;
    long newM, newW;
    if (m - w > newStuff) {
      newM = m;
      newW = w + newStuff;
    } else {
      long remainingHalf = (newStuff - m + w + 1) / 2;
      newM = m + remainingHalf;
      newW = w + newStuff - remainingHalf;
    }

    long newRemainingCandies = currentCandies % p;

    long maxNewPasses = requiredPasses(newRemainingCandies, newM, newW, n);
    long maxPasses = requiredPasses(currentCandies, m, w, n);

    if (maxNewPasses <= maxPasses) {
      m = newM;
      w = newW;
      currentCandies = newRemainingCandies;
    }
  }
}
