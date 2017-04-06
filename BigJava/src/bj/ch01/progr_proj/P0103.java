package bj.ch01.progr_proj;

import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class P0103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter accuracy: ");
        double accuracy = in.nextDouble();
        accuracy /= 4.0;

        double divisor = 3.0;
        double sum1;
        double sum2 = 1.0;
        int count = 0;

        do {
            sum1 = sum2;
            sum2 = sum1 - 1.0 / divisor;
            divisor += 2.0;
            sum1 = sum2;
            sum2 = sum1 + 1.0 / divisor;
            divisor += 2.0;
            count += 2;
        } while(Math.abs(sum1 - sum2) >= accuracy);

        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        double pi = sum2 * 4;
        System.out.println(pi);
        System.out.println(count);
    }
}
