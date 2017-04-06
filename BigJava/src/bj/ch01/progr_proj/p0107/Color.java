package bj.ch01.progr_proj.p0107;

/**
 * Created by den1t on 26.03.2017.
 */
public enum Color {
    GREEN(' '),
    RED('*'),
    OPENING('o');

    private char character;

    Color(char character) {
        this.character = character;
    }

    char getCharacter() {
        return character;
    }
}
