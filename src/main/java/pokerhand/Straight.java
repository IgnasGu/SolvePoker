package pokerhand;

import card.Card;
import enums.CardValue;
import enums.PokerHandName;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static utils.Utils.getDescendingSortedValues;

public class Straight implements PokerHandFactory, PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        List<Integer> sortedValues = hand.stream().map(card -> card.getValue().equals(CardValue.ACE) ? 0 : card.getValue().ordinal()).sorted().collect(toList());

        int firstValue = sortedValues.get(0);
        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(toList());

        return straight.equals(sortedValues);
    }

    @Override
    public PokerHandName getPokerHand() {
        return PokerHandName.STRAIGHT;
    }

    @Override
    public int compare(List<Card> firsHand, List<Card> secondHand) {
        List<Integer> firstHandValues = getDescendingSortedValues(firsHand);
        List<Integer> secondHandValues = getDescendingSortedValues(secondHand);
        return Integer.compare(firstHandValues.get(0), secondHandValues.get(0));
    }
}
