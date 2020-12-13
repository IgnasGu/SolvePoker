package pokerhand;

import card.Card;
import enums.PokerHands;

import java.util.List;

import static utils.Utils.*;

public class Flush implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return hand.stream().map(Card::getSymbol).distinct().count() == 1;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.FLUSH;
    }

    @Override
    public int compare(List<Card> firsHand, List<Card> secondHand) {
        List<Integer> firstHandValues = getDescendingSortedValues(firsHand);
        List<Integer> secondHandValues = getDescendingSortedValues(secondHand);
        return compareCardValues(firstHandValues, secondHandValues);
    }

}
