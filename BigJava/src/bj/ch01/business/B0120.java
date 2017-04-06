package bj.ch01.business;

/**
 * Created by den1t on 26.03.2017.
 */
public class B0120 {
    public static void main(String[] args) {
        String[][] pairs = {
                {"Good morning.", "Доброе утро!"},
                {"It's a pleasure to meet you.", "Приятно познакомиться."},
                {"Please call me tomorrow.", "Пожалуйста позвони мне завтра."},
                {"Have a nice day!", "Приятного дня!"}
        };

        for (String[] pair : pairs) {
            System.out.printf("%-30s -- %-30s%n", pair[0], pair[1]);
        }
    }
}
