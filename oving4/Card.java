package oving4;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private char color;
    private int value;
    List<Character> colors = new ArrayList<Character>();

    public Card(char c, int v) {
        colors.add('C');
        colors.add('H');
        colors.add('D');
        colors.add('S');

        if (colorOK(c) && valueOK(v)) {
            color = c;
            value = v;
        } else
            throw new IllegalArgumentException("Ikke riktig verdi eller farge");

    }

    private boolean colorOK(char c) {
        boolean state = false;
        for (int i = 0; i < 4; i++) {
            if (colors.get(i) == c) {
                state = true;
            }

        }
        return state;
    }

    private boolean valueOK(int i) {
        if (i > 0 && i < 14) {
            return true;
        } else
            return false;
    }

    public char getSuit() {
        return this.color;
    }

    public int getFace() {
        return value;
    }

    @Override
    public String toString() {
        return "" + color + value + "";
    }

    public static void main(String[] args) {
        Card kort = new Card('C', 1);
        System.out.println(kort);
    }

}
