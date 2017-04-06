package bj.ch01.business;

/**
 * Created by den1t on 26.03.2017.
 */
public class B0119 {
    public static void main(String[] args) {
        String[][] data = {
                {"Dave", "23.01.1970"},
                {"Jack", "14.03.1973"}
        };
        for(String[] d : data) {
            System.out.printf("%8s\t%10s%n", d[0], d[1]);
        }
    }
}
