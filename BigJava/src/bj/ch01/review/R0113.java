package bj.ch01.review;

/**
 * Created by den1t on 26.03.2017.
 */
public class R0113 {
    public static void main(String[] args) {
        double balance = 10_000.0;
        double interestRate = 0.06;
        double monthlyWithdrawal = 500.0;

        int year = 0;
        while (balance > 0) {
            balance -= monthlyWithdrawal * 12;
            balance *= (1.0 + interestRate);
            year++;
            System.out.printf("%02d year: %8.3f%n", year, balance);
        }
    }
}
