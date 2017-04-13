package com.jdojo.train.datatype;


import java.util.ArrayList;
import java.util.Date;

public class Foo {

    public static void main(String... args) {
        ArrayList<String> files = new ArrayList<>();
//        files.add(new Date());
        files.add("file1");
        String f1 = files.get(0);
        System.out.println(f1);
    }

    private static int min3(int a, int b, int c) {
        int m = (a < b) ? a : b;
        return (m < c) ? m : c;
    }


}
