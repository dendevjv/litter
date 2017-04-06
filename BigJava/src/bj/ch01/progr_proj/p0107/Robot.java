package bj.ch01.progr_proj.p0107;

/**
 * This Robot walks and counts openings in walls.
 */
public class Robot {
    private int x;
    private int y;
    private Direction dir;
    private Room room;
    private int windowCount = 0;
    private int startX;
    private int startY;
    private boolean nearWindow = false;
    private boolean foundWall = false;

    public Robot(Room room) {
        this.room = room;
        /* Place the robot at lower left corner. */
        x = room.getWidth() / 2;
        y = room.getHeight() / 2;
        dir = Direction.RIGHT;
    }

    int getX() { return x; }

    int getY() { return y; }

    void setPositionAsInitial() {
        startX = x;
        startY = y;
    }

    int getWindowCount() { return windowCount; }

    public void advance() {
        if (!canMoveForward()) {
            turnLeft();
            if (!foundWall) {
                foundWall = true;
                setPositionAsInitial();
            }
        }
        moveForward();
        if (isNearWindow()) {
            nearWindow = true;
        } else {
            if (nearWindow) {
                windowCount++;
                nearWindow = false;
            }
        }
    }

    boolean isNearWindow() {
        return dir == Direction.UP
                && room.getColorAt(y, x + 1) == Color.OPENING
                || dir == Direction.LEFT
                && room.getColorAt(y - 1, x) == Color.OPENING
                || dir == Direction.DOWN
                && room.getColorAt(y, x - 1) == Color.OPENING
                || dir == Direction.RIGHT
                && room.getColorAt(y + 1, x) == Color.OPENING;
    }

    public boolean reachedInitialPos() {
        return x == startX && y == startY;
    }

    private boolean canMoveForward() {
        Color nextColor = Color.RED;
        switch (dir) {
            case UP:
                nextColor = room.getColorAt(y - 1, x);
                break;
            case LEFT:
                nextColor = room.getColorAt(y, x - 1);
                break;
            case RIGHT:
                nextColor = room.getColorAt(y, x + 1);
                break;
            case DOWN:
                nextColor = room.getColorAt(y + 1, x);
                break;
        }
        return nextColor == Color.GREEN;
    }

    void turnLeft() {
        switch (dir) {
            case RIGHT:
                dir = Direction.UP;
                break;
            case UP:
                dir = Direction.LEFT;
                break;
            case LEFT:
                dir = Direction.DOWN;
                break;
            case DOWN:
                dir = Direction.RIGHT;
                break;
        }
    }

    void turnRight() {
        switch (dir) {
            case LEFT:
                dir = Direction.UP;
                break;
            case UP:
                dir = Direction.RIGHT;
                break;
        }
    }

    void moveForward() {
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
            case DOWN:
                y++;
                break;
        }
    }
}
