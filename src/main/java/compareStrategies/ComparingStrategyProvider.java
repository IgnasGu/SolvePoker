package compareStrategies;

import card.Card;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ComparingStrategyProvider {
    private List<CompareStrategy> strategies = new ArrayList<>();

    public ComparingStrategyProvider() {
        this.strategies = asList(
                new StraightCompareStrategy(),
                new FlushCompareStrategy(),
                new DefaultCompareStrategy()
        );
    }

    public CompareStrategy provideCompareStrategy(List<Card> firsHand, List<Card> secondHand) {
        return strategies.stream()
                .filter(compareStrategy -> compareStrategy.isApplicable(firsHand, secondHand))
                .findFirst()
                .get();
    }
}
