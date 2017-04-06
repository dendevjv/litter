package bj.ch01.pract_exer;

/**
 * Created by den1t on 26.03.2017.
 */
public class E0106 {
    private static String[] D = {
            "***  ",
            "*   *",
            "*   *",
            "*   *",
            "***  ",
    };
    private static String[] E = {
            "*****",
            "*    ",
            "*****",
            "*    ",
            "*****",
    };
    private static String[] N = {
            "*   *",
            "**  *",
            "* * *",
            "*  **",
            "*   *",
    };

    public static void main(String[] args) {
        String[] text = concatenate(D, E, E, N);
        display(text);
    }

    private static void display(String[] text) {
        for (String line : text) {
            System.out.println(line);
        }
    }

    private static String[] concatenate(String[]... d) {
        int h = d[0].length;
        String[] t = new String[h];
        for (int i = 0; i < h; i++) {
            t[i] = "";
        }

        for (String[] ch : d) {
            for (int i = 0; i < h; i++) {
                t[i] = t[i] + "  " + ch[i];
            }
        }
        return t;
    }

}
