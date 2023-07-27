package oving4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CardDeck {
    List<Card> deck = new ArrayList<Card>();

    public CardDeck(int n) {
        if (n < 0 || n > 13) {
            throw new IllegalArgumentException("ugyldig ");
        }

        else
            for (int i = 1; i < n + 1; i++) {
                deck.add(new Card('S', i));
            }
        for (int i = 1; i < n + 1; i++) {
            deck.add(new Card('H', i));
        }
        for (int i = 1; i < n + 1; i++) {
            deck.add(new Card('D', i));
        }
        for (int i = 1; i < n + 1; i++) {
            deck.add(new Card('C', i));
        }
    }

    public int getCardCount() {
        return deck.size();

    }

    public Card getCard(int n) {
        if (n < 0 || n > deck.size()) {
            throw new IllegalArgumentException("not available");

        } else
            return deck.get(n);
    }

    public void shufflePerfectly() {
        List<Card> leftHalf = deck.subList(0, deck.size() / 2);
        List<Card> rightHalf = deck.subList(deck.size() / 2, deck.size());

        List<Card> shuffledDeck = new ArrayList<Card>();

        for (int i = 0; i < leftHalf.size(); i++) {
            shuffledDeck.add(leftHalf.get(i));
            shuffledDeck.add(rightHalf.get(i));
        }

        Collections.copy(deck, shuffledDeck);

    }

    public void deal(CardHand hand, int n) {
        if ((n >= 0) && (n <= deck.size())) {
            for (int i = 0; i < n; i++) {
                Card c = deck.get(deck.size() - 1);
                hand.addCard(c);
                deck.remove(c);
            }
        } else
            throw new IllegalArgumentException("ugyldig");

    }

    public static void main(String[] args) {
        CardDeck kortstokk = new CardDeck(2);
        System.out.println(kortstokk.getCardCount());
    }
}
