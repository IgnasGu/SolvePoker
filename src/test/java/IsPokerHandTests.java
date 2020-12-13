import card.Card;
import org.junit.Test;
import pokerhand.Flush;
import pokerhand.Straight;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPokerHandTests {

    @Test
    public void testIsStraight_true(){
        List<Card> hand = TestUtils.getStraightLower();
        assertTrue(new Straight().isPokerHand(hand));
    }

    @Test
    public void testIsStraight_false(){
        List<Card> hand = TestUtils.getFlushLower();
        assertFalse(new Straight().isPokerHand(hand));
    }

    @Test
    public void testIsFlush_true(){
        List<Card> hand = TestUtils.getFlushLower();
        assertTrue(new Flush().isPokerHand(hand));
    }

    @Test
    public void testIsFlush_false(){
        List<Card> hand = TestUtils.getStraightLower();
        assertFalse(new Flush().isPokerHand(hand));
    }
}
