package bj.ch01.progr_proj;

import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class P0105 {

    public static final String BLACK = "*";
    public static final String WHITE = " ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();

        int verticalGap1 = (rows - 3) / 2;
        int verticalGap2 = rows - 3 - verticalGap1;
        printRow(cols);
        for (int i = 0; i < verticalGap1; i++) {
            printRowWithSpaces(cols);
        }
        printMiddleRow(cols);
        for (int i = 0; i < verticalGap2; i++) {
            printRowWithSpaces(cols);
        }
        printRow(cols);
    }

    private static void printMiddleRow(int cols) {
        final int dash = 3;
        int gap1 = (cols - dash - 2) / 2;
        int gap2 = cols - dash - 2 - gap1;
        System.out.print(BLACK);
        for (int i = 0; i < gap1; i++) {
            System.out.print(WHITE);
        }
        for (int i = 0; i < dash; i++) {
            System.out.print(BLACK);
        }
        for (int i = 0; i < gap2; i++) {
            System.out.print(WHITE);
        }
        System.out.println(BLACK);
    }

    private static void printRowWithSpaces(int cols) {
        System.out.print(BLACK);
        cols -= 2;
        for (int i = 0; i < cols; i++) {
            System.out.print(WHITE);
        }
        System.out.println(BLACK);
    }

    private static void printRow(int cols) {
        for (int i = 0; i < cols; i++) {
            System.out.print(BLACK);
        }
        System.out.println();
    }
}
