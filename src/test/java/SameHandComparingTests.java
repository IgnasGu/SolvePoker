import card.Card;
import compareStrategies.CompareStrategy;
import compareStrategies.ComparingStrategyProvider;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SameHandComparingTests {

    private final ComparingStrategyProvider csp = new ComparingStrategyProvider();


    @Test
    public void testStraight_firstWin() {
        List<Card> firstHand = TestUtils.getStraightHigher();
        List<Card> secondHand = TestUtils.getStraightLower();
        CompareStrategy cs = csp.provideCompareStrategy(firstHand, secondHand);
        assertEquals(1, cs.compare(firstHand, secondHand));
    }

    @Test
    public void testStraight_secondWin() {
        List<Card> secondHand = TestUtils.getStraightHigher();
        List<Card> firstHand = TestUtils.getStraightLower();
        CompareStrategy cs = csp.provideCompareStrategy(firstHand, secondHand);
        assertEquals(-1, cs.compare(firstHand, secondHand));
    }

    @Test
    public void testFlush_firstWin() {
        List<Card> firstHand = TestUtils.getFlushHigher();
        List<Card> secondHand = TestUtils.getFlushLower();
        CompareStrategy cs = csp.provideCompareStrategy(firstHand, secondHand);
        assertEquals(1, cs.compare(firstHand, secondHand));
    }

    @Test
    public void testFlush_secondWin() {
        List<Card> firstHand = TestUtils.getFlushLower();
        List<Card> secondHand = TestUtils.getFlushHigher();
        CompareStrategy cs = csp.provideCompareStrategy(firstHand, secondHand);
        assertEquals(-1, cs.compare(firstHand, secondHand));
    }

    @Test
    public void testFlush_Wins_Over_Straigh() {
        List<Card> firstHand = TestUtils.getFlushLower();
        List<Card> secondHand = TestUtils.getStraightHigher();
        CompareStrategy cs = csp.provideCompareStrategy(firstHand, secondHand);
        assertEquals(1, cs.compare(firstHand, secondHand));
    }
}
