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


    // Factory methods. Leaving these, we could set Constructor to private.
    public static Card newDiamondCard(CardValues cardValue){
        return new Card(CardSymbols.DIAMOND, cardValue);
    }

    public static Card newSpadeCard(CardValues cardValue){
        return new Card(CardSymbols.SPADE, cardValue);
    }

    // Can be added to inner static class. Creation: Card.Factory.newClubCard(..)
    public static class Factory{
        public static Card newClubCard(CardValues cardValue){
            return new Card(CardSymbols.CLUB, cardValue);
        }

        public static Card newHeartCard(CardValues cardValue){
            return new Card(CardSymbols.HEART, cardValue);
        }
    }

}
