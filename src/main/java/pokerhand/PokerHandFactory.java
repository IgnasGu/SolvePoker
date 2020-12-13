package pokerhand;

import card.Card;

import java.util.Arrays;
import java.util.List;

public interface PokerHandFactory {
    public static List<PokerHand> pokerHands = Arrays.asList(
            new Flush(),
            new Straight()
    );

    public static PokerHand getPokerHand(List<Card> hand) {
        return pokerHands.stream().filter(pokerHand -> pokerHand.isPokerHand(hand)).findFirst().get();
    }
}
