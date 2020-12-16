package pokerhand;

import card.Card;
import enums.HandValue;

import java.util.List;

public interface PokerHand {
    boolean isPokerHand(List<Card> hand);
    HandValue getValue();
}
