package pokerhand;

import card.Card;
import enums.CardValue;
import enums.PokerHandName;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Straight implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        List<Integer> sortedValues = hand.stream().map(card -> card.getValue().equals(CardValue.ACE) ? 0 : card.getValue().ordinal()).sorted().collect(toList());

        int firstValue = sortedValues.get(0);
        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(toList());

        return straight.equals(sortedValues);
    }

    @Override
    public PokerHandName getName() {
        return PokerHandName.STRAIGHT;
    }
}
