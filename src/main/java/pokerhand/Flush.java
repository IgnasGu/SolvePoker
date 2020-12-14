package pokerhand;

import card.Card;
import enums.PokerHandName;

import java.util.List;

public class Flush implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return hand.stream().map(Card::getSymbol).distinct().count() == 1;
    }

    @Override
    public PokerHandName getName() {
        return PokerHandName.FLUSH;
    }
}
