package card;

import enums.CardSymbol;
import enums.CardValue;

public class Card {

    public CardSymbol cardSymbols;
    public CardValue cardValues;

    public Card(CardSymbol cardSymbols, CardValue cardValues) {
        this.cardSymbols = cardSymbols;
        this.cardValues = cardValues;
    }

    public Card() {}

    public CardSymbol getSymbol() {
        return cardSymbols;
    }
    public CardValue getValue() {
        return cardValues;
    }

    @Override
    public String toString() {
        String bulletSymbol = "*";
        switch (this.cardSymbols){
            case DIAMOND:
                bulletSymbol = "♦";
                break;
            case SPADE:
                bulletSymbol = "♠";
                break;
            case CLUB:
                bulletSymbol = "♣";
                break;
            case HEART:
                bulletSymbol = "♥";
                break;
        }
        return bulletSymbol + " {" + cardSymbols + ' ' + cardValues + '}';
    }


    // Factory methods. Leaving these, we could set Constructor to private.
    public static Card newDiamondCard(CardValue cardValue){
        return new Card(CardSymbol.DIAMOND, cardValue);
    }

    public static Card newSpadeCard(CardValue cardValue){
        return new Card(CardSymbol.SPADE, cardValue);
    }

    // Can be added to inner static class. Creation: Card.Factory.newClubCard(..)
    public static class Factory{
        public static Card newClubCard(CardValue cardValue){
            return new Card(CardSymbol.CLUB, cardValue);
        }

        public static Card newHeartCard(CardValue cardValue){
            return new Card(CardSymbol.HEART, cardValue);
        }
    }

}
