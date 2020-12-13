package pokerhand;

import card.Card;
import enums.PokerHands;

import java.util.List;

public interface PokerHand {
    public boolean isPokerHand(List<Card> hand);

    public PokerHands getPokerHand();

    public int compare(List<Card> firsHand, List<Card> secondHand);

}
