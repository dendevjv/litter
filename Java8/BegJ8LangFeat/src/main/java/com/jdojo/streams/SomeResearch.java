package com.jdojo.streams;

import java.util.function.Supplier;

/**
 * Created for research on 06.04.2017.
 */
public class SomeResearch {
    public static void main(String[] args) {
        Supplier ws = new RandomWordSupplier(26);
        long start = System.currentTimeMillis();
        int size = 100000;

//        Stream.<String>generate(ws)
//                .limit(size)
//                .map(PrimeUtil::reverse); //.forEach(System.out::println);

        long e = System.currentTimeMillis() - start;
        System.out.println(e + " ms");

//        Stream.generate(ws).limit(size).forEach(System.out::println);
    }
}
