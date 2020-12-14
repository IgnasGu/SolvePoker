package card;

import enums.CardSymbol;
import enums.CardValue;

public class CardBuilder {

    protected Card card = new Card();

    public CardBuilder symbol(CardSymbol symbol){
        card.cardSymbols = symbol;
        return this;
    }

    public CardBuilder value(CardValue value){
        card.cardValues = value;
        return this;
    }

    public Card build(){
        return card;
    }
}
