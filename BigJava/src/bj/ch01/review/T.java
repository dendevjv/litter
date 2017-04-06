package bj.ch01.review;

import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class T {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double b = 10_000.0;
        int y = getInt("Enter year: ");
        double b2 = b;
        for (int i = 0; i < y; i++) {
            b2 = b2 + b2 * 0.06;
        }
        System.out.println("After " + y + " years balance from\n" + b + " to " + b2);
        double b3 = b;
        int m = y * 12;
        for (int i = 0; i < m; i++) {
            b3 = b3 + b3 * 0.06 / 12;
        }
        System.out.println("After " + m + " months balance from\n" + b + " to " + b3);
    }

    private static int getInt(String p) {
        System.out.print(p);
        return in.nextInt();
    }
}
