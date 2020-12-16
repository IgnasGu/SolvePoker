package pokerhand;

import card.Card;
import enums.HandValue;

import java.util.List;

public class Flush implements PokerHand {
    public Flush() {
    }

    @Override
    public boolean isPokerHand(List<Card> hand) {
        return hand.stream()
                .map(Card::getColor)
                .distinct()
                .count() == 1;
    }

    @Override
    public HandValue getValue() {
        return HandValue.FLUSH;
    }


}
