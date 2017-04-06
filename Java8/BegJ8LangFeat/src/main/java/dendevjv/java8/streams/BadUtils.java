package dendevjv.java8.streams;

/**
 * Created for research on 06.04.2017.
 */
public class BadUtils {
    private static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }
}
