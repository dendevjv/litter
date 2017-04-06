package bj.ch01.pract_exer;

import javax.swing.*;
import java.net.URL;

/**
 * Created by den1t on 26.03.2017.
 */
public class E0118 {
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null,
                "Hello",
                "Title",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon(imageLocation));
    }
}
