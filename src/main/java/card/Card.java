package card;

import enums.CardSymbols;
import enums.CardValues;

public class Card {

    private CardSymbols cardSymbols;
    private CardValues cardValues;

    public Card(CardSymbols cardSymbols, CardValues cardValues) {
        this.cardSymbols = cardSymbols;
        this.cardValues = cardValues;
    }

    public CardSymbols getSymbol() {
        return cardSymbols;
    }
    public CardValues getValue() {
        return cardValues;
    }
}
