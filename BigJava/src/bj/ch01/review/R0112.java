package bj.ch01.review;

import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class R0112 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double cardPrice = getDouble("Enter card price: ");
        double regularPrice = getDouble("Enter regular Price: ");
        int freePeriod = getInt("Enter free period: ");
        int numBoughtMeals = getInt("Enter number of bought meals: ");
        final int numFreeMealsPerDay = 1;

        double sumRegular = (numBoughtMeals + freePeriod * numFreeMealsPerDay) * regularPrice;
        double sumDiscount = numBoughtMeals * regularPrice + cardPrice;
        System.out.println("Regular sum:  " + sumRegular);
        System.out.println("Discount sum: " + sumDiscount);
    }

    private static double getDouble(String p) {
        System.out.print(p);
        return in.nextDouble();
    }

    private static int getInt(String p) {
        System.out.print(p);
        return in.nextInt();
    }
}
