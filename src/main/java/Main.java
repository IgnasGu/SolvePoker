import card.Card;
import enums.CardSymbols;
import enums.CardValues;
import pokerhand.PokerHand;
import pokerhand.PokerHandFactory;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        List<Card> firstHand = asList(
                new Card(CardSymbols.CLUB, CardValues.SIX),
                new Card(CardSymbols.DIAMOND, CardValues.TWO),
                new Card(CardSymbols.CLUB, CardValues.FOUR),
                new Card(CardSymbols.HEART, CardValues.THREE),
                new Card(CardSymbols.CLUB, CardValues.FIVE)
        );

        List<Card> secondHand = asList(
                new Card(CardSymbols.CLUB, CardValues.EIGHT),
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.QUEEN),
                new Card(CardSymbols.CLUB, CardValues.SEVEN),
                new Card(CardSymbols.CLUB, CardValues.JACK)
        );

        PokerHand firstPokerHand = PokerHandFactory.getPokerHand(firstHand);
        PokerHand secondPokerHand = PokerHandFactory.getPokerHand(secondHand);

        if (firstPokerHand.getPokerHand().ordinal() > secondPokerHand.getPokerHand().ordinal()) {
            System.out.println(String.format("First hand won! With a %s", firstPokerHand.getPokerHand()));
        } else if (firstPokerHand.getPokerHand().ordinal() < secondPokerHand.getPokerHand().ordinal()) {
            System.out.println(String.format("Second hand won! With a %s", secondPokerHand.getPokerHand()));
        } else {
            determineSamePokerHandWinner(firstHand, secondHand, firstPokerHand, secondPokerHand);
        }
    }

    private static void determineSamePokerHandWinner(List<Card> firstHand, List<Card> secondHand, PokerHand firstPokerHand, PokerHand secondPokerHand) {
        switch (firstPokerHand.compare(firstHand, secondHand)){
            case 1:
                System.out.println(String.format("First hand won! With a %s", firstPokerHand.getPokerHand()));
                break;
            case -1:
                System.out.println(String.format("Second hand won! With a %s", secondPokerHand.getPokerHand()));
                break;
            case 0:
                System.out.println(String.format("It's a draw with %s hand", firstPokerHand.getPokerHand()));
        }
    }
}
