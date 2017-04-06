package bj.ch01.review;

import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class R0119 {
    private static Scanner in = new Scanner(System.in);
    private static int count = 0;

    public static void main(String[] args) {
        double d = getDouble("Enter decimal value: ");
        double accuracy = getDouble("Enter accuracy: ");
        double r = squareRoot(d, accuracy);
        System.out.println("Square root = " + r);
        System.out.println(count + " iterations.");
    }

    private static double squareRoot(double d, double accuracy) {
        double g1 = d / 2.0;
        double g2 = d / g1;
        while (Math.abs(g1 - g2) >= accuracy) {
            g1 = (g1 + g2) / 2;
            g2 = d / g1;
            count++;
        }
        return g1;
    }

    private static double getDouble(String p) {
        System.out.print(p);
        double v = in.nextDouble();
        in.nextLine();
        return v;
    }
}
