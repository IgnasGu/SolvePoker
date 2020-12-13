import card.Card;
import enums.PokerHands;
import org.junit.Test;
import pokerhand.PokerHandFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PokerHandFactoryTests {


    @Test
    public void testIsStraight(){
        List<Card> hand = TestUtils.getStraightLower();
        assertEquals(PokerHands.STRAIGHT, PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsFlush(){
        List<Card> hand = TestUtils.getFlushLower();
        assertEquals(PokerHands.FLUSH, PokerHandFactory.getPokerHand(hand).getPokerHand());
    }
}
