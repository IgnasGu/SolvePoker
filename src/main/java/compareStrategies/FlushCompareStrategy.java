package compareStrategies;

import card.Card;
import pokerhand.PokerHandFactory;

import java.util.List;

import static enums.PokerHandName.FLUSH;
import static utils.Utils.compareCardValues;
import static utils.Utils.getDescendingSortedValues;

public class FlushCompareStrategy implements CompareStrategy {
    @Override
    public boolean isApplicable(List<Card> firsHand, List<Card> secondHand) {
        return FLUSH.equals(PokerHandFactory.getPokerHand(firsHand).getName())
                && FLUSH.equals(PokerHandFactory.getPokerHand(secondHand).getName());
    }

    @Override
    public int compare(List<Card> firsHand, List<Card> secondHand) {
        List<Integer> firstHandValues = getDescendingSortedValues(firsHand);
        List<Integer> secondHandValues = getDescendingSortedValues(secondHand);
        return compareCardValues(firstHandValues, secondHandValues);
    }
}
