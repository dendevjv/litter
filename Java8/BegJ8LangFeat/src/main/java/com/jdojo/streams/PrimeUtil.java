package com.jdojo.streams;

public class PrimeUtil {
    public static final String WORD = "ABCDEFGHIJKLMONPQRSTUVWXYZ";
    /** Used for a statefull PrimeUtil */
    private long lastPime = 0L;

    /** Computes the prime number after the last generated prime. */
    public long next() {
        lastPime = next(lastPime);
        return lastPime;
    }

    /** Computes the prime number after the specified number. */
    public static long next(long after) {
        long counter = after;
        while (!isPrime(++counter));
        return counter;
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if ((number & 1) == 0) {
            return false;
        }
        long maxDivisor = (long)Math.sqrt(number);
        for (int counter = 3; counter <= maxDivisor; counter += 2) {
            if (number % counter == 0) {
                return false;
            }
        }
        return true;
    }

}
