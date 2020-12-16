package pokerhand;

import card.Card;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Straight implements PokerHand {
    public Straight() {
    }

    @Override
    public boolean isPokerHand(List<Card> hand) {
        List<Integer> sortedCards = hand.stream()
                .map(Card::getValue)
                .map(Enum::ordinal)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        if (sortedCards.size() < 5) {
            return false;
        }
        return (sortedCards.get(sortedCards.size() - 1) - sortedCards.get(0)) == 4;   // 2 3 4 4 6 /
    }

    // TEN, JACK, QUEEN, KING, ACE,
    // ACE, TWO, THREE, FOUR, FIVE,
}
