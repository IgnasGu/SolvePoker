package compareStrategies;

import card.Card;

import java.util.List;

public interface CompareStrategy {

    public boolean isApplicable(List<Card> firsHand, List<Card> secondHand);

    public int compare(List<Card> firsHand, List<Card> secondHand);
}
