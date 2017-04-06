package bj.ch01.progr_proj.p0107;

import java.util.Scanner;

/**
 * Created by den1t on 29.03.2017.
 */
public class P0107 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Room room = new Room(12, 11);
        room.addOpening(new Opening(2,0,3));
        room.addOpening(new Opening(11,3,4));
        room.addOpening(new Opening(0,2,1));
        room.addOpening(new Opening(3,10,1));
//        room.display();

//        Room room = new Room(4, 4);

        Robot robot = new Robot(room);

        while (!robot.reachedInitialPos()) {
            robot.advance();
            room.displayWithRobotAt(robot.getY(), robot.getX());
            pause(250);
//            pressEnter();
        }
        System.out.println("Robot found " + robot.getWindowCount() + " windows");
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
