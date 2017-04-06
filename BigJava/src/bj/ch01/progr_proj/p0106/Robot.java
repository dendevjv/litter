package bj.ch01.progr_proj.p0106;

/**
 * Created by den1t on 26.03.2017.
 */
public class Robot {
    private int x;
    private int y;
    private Direction dir;
    private Lawn lawn;

    public Robot(Lawn lawn) {
        this.lawn = lawn;
        /* Place the robot at lower left corner. */
        x = 1;
        y = lawn.getHeight() - 2;
        dir = Direction.RIGHT;
    }

    int getX() { return x; }

    int getY() { return y; }

    public void advance() {
        if (!canMoveForward()) {
            tryToFindDirection();
        }
        moveForward();
        if (dir == Direction.UP) {
            if (lawn.getColorAt(y, x - 1) == Color.RED) {
                dir = Direction.RIGHT;
            } else if (lawn.getColorAt(y, x + 1) == Color.RED) {
                dir = Direction.LEFT;
            }
        }
    }

    public boolean reachedFinish() {
        return x == 1 && y == 1;
    }

    private void tryToFindDirection() {
        switch (dir) {
            case UP:
                if (lawn.getColorAt(y - 1, x) == Color.RED) {
                    dir = Direction.LEFT;
                }
                break;
            case LEFT:
                if (lawn.getColorAt(y, x - 1) == Color.RED) {
                    dir = Direction.UP;
                }
                break;
            case RIGHT:
                if (lawn.getColorAt(y, x + 1) == Color.RED) {
                    dir = Direction.UP;
                }
                break;
        }
    }

    public boolean canMoveForward() {
        Color nextColor = Color.RED;
        switch (dir) {
            case UP:
                nextColor = lawn.getColorAt(y - 1, x);
                break;
            case LEFT:
                nextColor = lawn.getColorAt(y, x - 1);
                break;
            case RIGHT:
                nextColor = lawn.getColorAt(y, x + 1);
                break;
        }
        return nextColor == Color.GREEN;
    }

    public void turnLeft() {
        switch (dir) {
            case RIGHT:
                dir = Direction.UP;
                break;
            case UP:
                dir = Direction.LEFT;
                break;
        }
    }

    public void turnRight() {
        switch (dir) {
            case LEFT:
                dir = Direction.UP;
                break;
            case UP:
                dir = Direction.RIGHT;
                break;
        }
    }

    public void moveForward() {
        switch (dir) {
            case RIGHT:
                x++;
                break;
            case UP:
                y--;
                break;
            case LEFT:
                x--;
                break;
        }
    }
}
