import card.Card;
import enums.Symbol;
import enums.Value;
import org.junit.Test;
import pokerhand.Straight;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class PokerHandTests {

    @Test
    public void name() {
        boolean result = new Straight().isPokerHand(
                asList(
                        new Card(Symbol.CLUB, Value.TWO),
                        new Card(Symbol.CLUB, Value.THREE),
                        new Card(Symbol.CLUB, Value.FOUR),
                        new Card(Symbol.SPADE, Value.FIVE),
                        new Card(Symbol.DIAMOND, Value.SIX)
                )
        );

        assertTrue(result);
    }

    @Test
    public void nameBooTruee() {
        boolean result = new Straight().isPokerHand(
                asList(
                        new Card(Symbol.CLUB, Value.ACE),
                        new Card(Symbol.CLUB, Value.KING),
                        new Card(Symbol.CLUB, Value.QUEEN),
                        new Card(Symbol.SPADE, Value.TEN),
                        new Card(Symbol.DIAMOND, Value.JACK)
                )
        );

        assertTrue(result);
    }

}
