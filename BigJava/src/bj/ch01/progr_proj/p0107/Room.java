package bj.ch01.progr_proj.p0107;

import java.util.Arrays;

/**
 * Created by den1t on 27.03.2017.
 */
class Room {
    public static final String ROBOT_CHAR = "\u00AE"; // \u00AE

    private Color[] cells;
    private int width;
    private int height;

    Room(int width, int height) {
        this.width = width;
        this.height = height;
        initializeLawn(width, height);
    }

    public static void main(String[] args) {
        Room room = new Room(7, 5);
        room.displayWithRobotAt(5 - 2, 1);
    }

    int getWidth() { return width; }

    int getHeight() { return height; }

    void display() {
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                printRoomCell(r, c);
            }
            System.out.println();
        }
    }

    void displayWithRobotAt(int row, int col) {
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                if (r == row && c == col) {
                    System.out.print(ROBOT_CHAR);
                } else {
                    printRoomCell(r, c);
                }
            }
            System.out.println();
        }
    }

    private void printRoomCell(int r, int c) {
        System.out.print(getColorAt(r, c).getCharacter());
    }

    private void initializeLawn(int width, int height) {
        cells = new Color[width * height];
        Arrays.fill(cells, Color.GREEN);

        /* Set red color to boundary cells */
        for (int i = 0; i < width; i++) {
            cells[i] = Color.RED;
        }
        int size = width * height;
        for (int i = width; i < size - width; i += width) {
            cells[i] = Color.RED;
            cells[i + width - 1] = Color.RED;
        }
        for (int i = width * (height - 1); i < size; i++) {
            cells[i] = Color.RED;
        }
    }

    void addOpening(Opening opening) {
        boolean vertical = opening.x == 0 || opening.x == getWidth() - 1;
        int c = opening.x;
        int r = opening.y;
        cells[index(r, c)] = Color.OPENING;
        int count = opening.width - 1;
        if (vertical) {
            for (int i = 0; i < count; i++) {
                r++;
                cells[index(r, c)] = Color.OPENING;
            }
        } else {
            for (int i = 0; i < count; i++) {
                c++;
                cells[index(r, c)] = Color.OPENING;
            }
        }
    }

    private int index(int row, int col) {
        return row * getWidth() + col;
    }

    Color getColorAt(int row, int col) {
        int index = row * width + col;
        return cells[index];
    }

}
