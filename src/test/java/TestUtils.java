import card.Card;
import card.CardBuilder;
import enums.CardSymbols;
import enums.CardValues;

import java.util.List;

import static java.util.Arrays.asList;

public class TestUtils {

    public static List<Card> getStraightLower() {
        return asList(
                new CardBuilder().symbol(CardSymbols.CLUB).value(CardValues.SIX).build(),
                new Card(CardSymbols.DIAMOND, CardValues.TWO),
                new Card(CardSymbols.CLUB, CardValues.FOUR),
                new Card(CardSymbols.HEART, CardValues.THREE),
                new Card(CardSymbols.CLUB, CardValues.FIVE)
        );
    }

    public static List<Card> getStraightHigher() {
        return asList(
                new Card(CardSymbols.CLUB, CardValues.EIGHT),
                new Card(CardSymbols.DIAMOND, CardValues.NINE),
                new Card(CardSymbols.CLUB, CardValues.JACK),
                new Card(CardSymbols.HEART, CardValues.TEN),
                new Card(CardSymbols.CLUB, CardValues.QUEEN)
        );
    }

    public static List<Card> getFlushHigher() {
        return asList(
                new Card(CardSymbols.CLUB, CardValues.EIGHT),
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.QUEEN),
                new Card(CardSymbols.CLUB, CardValues.SEVEN),
                new Card(CardSymbols.CLUB, CardValues.JACK)
        );
    }

    public static List<Card> getFlushLower() {
        return asList(
                new Card(CardSymbols.HEART, CardValues.EIGHT),
                new Card(CardSymbols.HEART, CardValues.TWO),
                new Card(CardSymbols.HEART, CardValues.QUEEN),
                new Card(CardSymbols.HEART, CardValues.SEVEN),
                new Card(CardSymbols.HEART, CardValues.JACK)
        );
    }
}
