package bj.ch01.progr_proj.p0106;

import java.util.Scanner;

/**
 * Created by den1t on 26.03.2017.
 */
public class P0106 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        final int w = 12;
        final int h = 9;

        Lawn lawn = new Lawn(w, h);
        Robot robot = new Robot(lawn);
        while (!robot.reachedFinish()) {
            robot.advance();
            lawn.displayWithDotAt(robot.getY(), robot.getX());
            pause(250);
//            pressEnter();
        }
    }

    private static void pressEnter() {
        System.out.print("> ");
        in.nextLine();
    }

    private static void pause(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
