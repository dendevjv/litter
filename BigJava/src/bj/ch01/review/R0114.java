package bj.ch01.review;

import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class R0114 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 10_000.0;
        double interestRate = getDouble("Enter interest rate: ",
                0.06);
        double monthlyWithdrawal = getDouble("Enter monthly withdrawal: ",
                500.0);

        int year = 0;
        while (balance > 0) {
            balance -= monthlyWithdrawal * 12;
            balance *= (1.0 + interestRate);
            year++;
            System.out.printf("%02d year: %8.3f%n", year, balance);
            if (year > 100) {
                System.out.println("It is too long... Terminating loop.");
                break;
            }
        }
    }

    private static double getDouble(String p, double defaultValue) {
        System.out.print("(Press Enter for default) " + p);
        String s = in.nextLine();
        if (s.isEmpty()) {
            return defaultValue;
        }
        return Double.parseDouble(s);
    }
}
