package compareStrategies;

import card.Card;
import pokerhand.PokerHandFactory;

import java.util.List;

import static utils.Utils.compareCardValues;
import static utils.Utils.getDescendingSortedValues;

public class DefaultCompareStrategy implements CompareStrategy {
    @Override
    public boolean isApplicable(List<Card> firsHand, List<Card> secondHand) {
        return true;
    }

    @Override
    public int compare(List<Card> firsHand, List<Card> secondHand) {
        int first = PokerHandFactory.getPokerHand(firsHand).getName().ordinal();
        int second = PokerHandFactory.getPokerHand(secondHand).getName().ordinal();
        if (first > second) {
            return 1;
        }
        if (first < second) {
            return -1;
        }
        List<Integer> firstHandValues = getDescendingSortedValues(firsHand);
        List<Integer> secondHandValues = getDescendingSortedValues(secondHand);
        return compareCardValues(firstHandValues, secondHandValues);
    }
}
