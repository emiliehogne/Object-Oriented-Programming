package oving5;

import java.util.Iterator;

public class CardContainerIterator implements Iterator<Card> {
    private CardContainer cardContainer;
    private int position;

    public CardContainerIterator(CardContainer cardContainer) {
        this.cardContainer = cardContainer;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {

        if (this.position <= cardContainer.getCardCount()) {
            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public Card next() {
        if (hasNext()) {
            position++;
            return cardContainer.getCard(position - 1);
        } else {
            return null;
        }

    }

}
