package com.jdojo.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by den1t on 06.04.2017.
 */
public class Foo {
    public static void main(String[] args) throws IOException {

        Optional<Bar> op = create("Jack");
        op.ifPresent(b -> System.out.println(b.getName()));
        System.out.println("finished");
    }

    private static Optional<Bar> create(String name) {
        boolean hasValue = Math.random() > 0.5;
        System.out.println("hasValue = " + hasValue);

        Bar bar = null;
        if (hasValue) {
            bar = new Bar(name);
        }
        return Optional.ofNullable(bar);
    }

    private static class Bar {
        String name;

        Bar(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Bar{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}


