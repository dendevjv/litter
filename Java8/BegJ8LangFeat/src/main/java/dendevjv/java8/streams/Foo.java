package dendevjv.java8.streams;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by den1t on 06.04.2017.
 */
public class Foo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("> ");
        int n = in.nextInt();
        boolean even = isEven(n);
        System.out.println(even ? "even" : "odd");

//        Stream<String> ss = Stream.<String>builder()
//                .add("Java").add("is").add("Cool").add("!!!").build();
//        ss.forEach((s) -> System.out.println(s));
    }

    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}


