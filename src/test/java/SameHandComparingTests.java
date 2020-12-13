import card.Card;
import org.junit.Test;
import pokerhand.Straight;

import java.util.List;

import static org.junit.Assert.*;

public class SameHandComparingTests {

    @Test
    public void testStraight_firstWin(){
        List<Card> firstHand = TestUtils.getStraightHigher();
        List<Card> secondHand = TestUtils.getStraightLower();
        int compareResult = new Straight().compare(firstHand, secondHand);
        assertEquals(1, compareResult);
    }

    @Test
    public void testStraight_secondWin(){
        List<Card> secondHand = TestUtils.getStraightHigher();
        List<Card> firstHand = TestUtils.getStraightLower();
        int compareResult = new Straight().compare(firstHand, secondHand);
        assertEquals(-1, compareResult);
    }

    @Test
    public void testFlush_firstWin(){
        List<Card> firstHand = TestUtils.getFlushHigher();
        List<Card> secondHand = TestUtils.getFlushLower();
        int compareResult = new Straight().compare(firstHand, secondHand);
        assertEquals(1, compareResult);
    }

    @Test
    public void testFlush_secondWin(){
        List<Card> firstHand = TestUtils.getFlushLower();
        List<Card> secondHand = TestUtils.getFlushHigher();
        int compareResult = new Straight().compare(firstHand, secondHand);
        assertEquals(-1, compareResult);
    }
}
