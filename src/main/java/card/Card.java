package card;

import enums.CardSymbols;
import enums.CardValues;

public class Card {

    public CardSymbols cardSymbols;
    public CardValues cardValues;

    public Card(CardSymbols cardSymbols, CardValues cardValues) {
        this.cardSymbols = cardSymbols;
        this.cardValues = cardValues;
    }

    public Card() {}

    public CardSymbols getSymbol() {
        return cardSymbols;
    }
    public CardValues getValue() {
        return cardValues;
    }

    @Override
    public String toString() {
        return "Card{" + cardSymbols + ' ' + cardValues + '}';
    }
}
