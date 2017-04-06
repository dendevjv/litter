package bj.ch01.pract_exer;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class T {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String msg = "Hello, " + name + "!!!";
        JOptionPane.showMessageDialog(null, msg);

        String greeting = "My name is Hal! What would you like me to do?";
        JOptionPane.showInputDialog(greeting);

        String answer = "I'm sorry, " + name + ". I'm afraid I can't do that.";
        JOptionPane.showMessageDialog(null, answer);
    }
}
