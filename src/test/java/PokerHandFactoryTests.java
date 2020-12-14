import card.Card;
import enums.PokerHandName;
import org.junit.Test;
import pokerhand.PokerHandFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PokerHandFactoryTests {


    @Test
    public void testIsStraight(){
        List<Card> hand = TestUtils.getStraightLower();
        assertEquals(PokerHandName.STRAIGHT, PokerHandFactory.getPokerHand(hand).getName());
    }

    @Test
    public void testIsFlush(){
        List<Card> hand = TestUtils.getFlushLower();
        assertEquals(PokerHandName.FLUSH, PokerHandFactory.getPokerHand(hand).getName());
    }
}
