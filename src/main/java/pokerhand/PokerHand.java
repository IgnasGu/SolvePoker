package pokerhand;

import card.Card;
import enums.PokerHandName;

import java.util.List;

public interface PokerHand {
    public boolean isPokerHand(List<Card> hand);

    public PokerHandName getName();
}
