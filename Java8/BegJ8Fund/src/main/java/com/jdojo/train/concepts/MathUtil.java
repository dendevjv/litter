package com.jdojo.train.concepts;

public class MathUtil {
    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static int max(int[] num) {
        int mx = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > mx) {
                mx = num[i];
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        printClassName(new Integer(42));
    }

    static void printClassName(Object obj) {
        System.out.println("The class of " + obj + " is " + obj.getClass().getName());
    }
}
