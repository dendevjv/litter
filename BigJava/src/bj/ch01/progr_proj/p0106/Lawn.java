package bj.ch01.progr_proj.p0106;

import java.util.Arrays;

/**
 * Created by den1t on 26.03.2017.
 */
public class Lawn {
    public static final String RED_CHAR = "*";
    public static final String GREEN_CHAR = " ";
    public static final String ROBOT_CHAR = "\u00A4";

    private Color[] cells;
    private int width;
    private int height;

    public Lawn(int width, int height) {
        this.width = width;
        this.height = height;
        initializeLawn(width, height);
    }

    public static void main(String[] args) {
        Lawn lawn = new Lawn(7, 5);
        lawn.displayWithDotAt(5 - 2, 1);
    }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    void display() {
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                System.out.print(getColorAt(r, c) == Color.RED ? RED_CHAR : GREEN_CHAR);
            }
            System.out.println();
        }
    }

    void displayWithDotAt(int row, int col) {
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                if (r == row && c == col) {
                    System.out.print(ROBOT_CHAR);
                } else {
                    System.out.print(getColorAt(r, c) == Color.RED ? RED_CHAR : GREEN_CHAR);
                }
            }
            System.out.println();
        }
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

    public Color getColorAt(int row, int col) {
        int index = row * width + col;
        return cells[index];
    }

}
