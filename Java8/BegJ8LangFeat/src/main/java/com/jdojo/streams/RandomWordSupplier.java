package com.jdojo.streams;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Created for research on 06.04.2017.
 */
class RandomWordSupplier implements Supplier<String> {
    private static final String LETTERS = "ABCDEFGHIJKLMONPQRSTUVWXYZ";
    private final Random rnd = new Random();

    private int length;

    RandomWordSupplier(int length) {
        this.length = length;
    }

    @Override
    public String get() {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(LETTERS.charAt(rnd.nextInt(LETTERS.length())));
        }
        return sb.toString();
    }
}
