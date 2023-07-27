package oving3;

import java.util.Arrays;

public class Nim {

    int[] piles = new int[3];

    public Nim() {
        piles[0] = 10;
        piles[1] = 10;
        piles[2] = 10;
    }

    public Nim(int pileSize) {
        piles[0] = pileSize;
        piles[1] = pileSize;
        piles[2] = pileSize;

    }

    void removePieces(int number, int targetPile) {
        if (isGameOver()) {
            throw new IllegalStateException("ugyldig");

        }

        else if (!isValidMove(number, targetPile)) {
            throw new IllegalArgumentException("ugyldig");
        } else
            this.piles[targetPile] -= number;

    }

    public boolean isValidMove(int number, int targetPile) {
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] == 0) {
                return false;
            }
        }

        if (number < 1 || (number > piles[targetPile]) || targetPile > 2 || targetPile < 0) {
            return false;
        } else
            return true;

    }

    public boolean isGameOver() {
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] == 0) {
                return true;
            }
        }
        return false;

    }

    int getPile(int targetPile) {
        return this.piles[targetPile];
    }

    @Override
    public String toString() {
        return "Nim [piles=" + Arrays.toString(piles) + "]";
    }

}
