import card.Card;
import card.CardBuilder;
import enums.CardSymbol;
import enums.CardValue;

import java.util.List;

import static java.util.Arrays.asList;

public class TestUtils {

    public static List<Card> getStraightLower() {
        return asList(
                new CardBuilder().symbol(CardSymbol.CLUB).value(CardValue.SIX).build(),
                new Card(CardSymbol.DIAMOND, CardValue.TWO),
                new Card(CardSymbol.CLUB, CardValue.FOUR),
                new Card(CardSymbol.HEART, CardValue.THREE),
                new Card(CardSymbol.CLUB, CardValue.FIVE)
        );
    }

    public static List<Card> getStraightHigher() {
        return asList(
                new Card(CardSymbol.CLUB, CardValue.EIGHT),
                new Card(CardSymbol.DIAMOND, CardValue.NINE),
                new Card(CardSymbol.CLUB, CardValue.JACK),
                new Card(CardSymbol.HEART, CardValue.TEN),
                new Card(CardSymbol.CLUB, CardValue.QUEEN)
        );
    }

    public static List<Card> getFlushHigher() {
        return asList(
                new Card(CardSymbol.CLUB, CardValue.EIGHT),
                new Card(CardSymbol.CLUB, CardValue.KING),
                new Card(CardSymbol.CLUB, CardValue.QUEEN),
                new Card(CardSymbol.CLUB, CardValue.SEVEN),
                new Card(CardSymbol.CLUB, CardValue.JACK)
        );
    }

    public static List<Card> getFlushLower() {
        return asList(
                new Card(CardSymbol.HEART, CardValue.EIGHT),
                new Card(CardSymbol.HEART, CardValue.TWO),
                new Card(CardSymbol.HEART, CardValue.QUEEN),
                new Card(CardSymbol.HEART, CardValue.SEVEN),
                new Card(CardSymbol.HEART, CardValue.JACK)
        );
    }
}
