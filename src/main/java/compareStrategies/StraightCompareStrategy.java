package compareStrategies;

import card.Card;
import pokerhand.PokerHandFactory;

import java.util.List;

import static enums.PokerHandName.STRAIGHT;
import static utils.Utils.getDescendingSortedValues;

public class StraightCompareStrategy implements CompareStrategy {
    @Override
    public boolean isApplicable(List<Card> firsHand, List<Card> secondHand) {
        return STRAIGHT.equals(PokerHandFactory.getPokerHand(firsHand).getName())
                && STRAIGHT.equals(PokerHandFactory.getPokerHand(secondHand).getName());
    }

    @Override
    public int compare(List<Card> firsHand, List<Card> secondHand) {
        List<Integer> firstHandValues = getDescendingSortedValues(firsHand);
        List<Integer> secondHandValues = getDescendingSortedValues(secondHand);
        return Integer.compare(firstHandValues.get(0), secondHandValues.get(0));
    }
}
