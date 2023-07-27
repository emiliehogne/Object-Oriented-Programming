package oving5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardHand implements CardContainer, Iterable<Card> {
    List<Card> hand = new ArrayList<Card>();

    public int getCardCount() {
        return hand.size();

    }

    public Card getCard(int n) {
        if (n < 0 || n > hand.size()) {
            throw new IllegalArgumentException("not available");

        } else
            return hand.get(n);
    }

    public void addCard(Card c) {
        hand.add(c);
    }

    public Card play(int n) {
        Card c = hand.get(n);
        hand.remove(c);
        return c;

    }

    public static void main(String[] args) {

    }

    @Override
    public Iterator<Card> iterator() {
        return hand.iterator();

    }

}
