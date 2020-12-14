package card;

import enums.CardSymbols;
import enums.CardValues;

public class CardBuilder {

    protected Card card = new Card();

    public CardBuilder symbol(CardSymbols symbol){
        card.cardSymbols = symbol;
        return this;
    }

    public CardBuilder value(CardValues value){
        card.cardValues = value;
        return this;
    }

    public Card build(){
        return card;
    }
}
