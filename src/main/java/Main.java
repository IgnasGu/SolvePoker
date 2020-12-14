import card.Card;
import enums.CardSymbols;
import enums.CardValues;
import list.ListStrategy;
import list.MarkdownListStrategy;
import list.TextProcessor;
import pokerhand.PokerHand;
import pokerhand.PokerHandFactory;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        TextProcessor<MarkdownListStrategy> tp = new TextProcessor(MarkdownListStrategy::new);
//        TextProcessor<MarkdownListStrategy> tp = new TextProcessor(HtmlListStrategy::new);

        List<Card> firstHand = asList(
                new Card(CardSymbols.CLUB, CardValues.SIX),
                new Card(CardSymbols.DIAMOND, CardValues.TWO),
                new Card(CardSymbols.CLUB, CardValues.FOUR),
                new Card(CardSymbols.HEART, CardValues.THREE),
                new Card(CardSymbols.CLUB, CardValues.FIVE)
        );

        List<Card> secondHand = asList(
                new Card(CardSymbols.CLUB, CardValues.EIGHT),
                new Card(CardSymbols.DIAMOND, CardValues.NINE),
                new Card(CardSymbols.CLUB, CardValues.JACK),
                new Card(CardSymbols.HEART, CardValues.TEN),
                new Card(CardSymbols.CLUB, CardValues.QUEEN)
        );

        PokerHand firstPokerHand = PokerHandFactory.getPokerHand(firstHand);
        PokerHand secondPokerHand = PokerHandFactory.getPokerHand(secondHand);

        if (firstPokerHand.getPokerHand().ordinal() > secondPokerHand.getPokerHand().ordinal()) {
            System.out.println(String.format("First hand won! With a %s", firstPokerHand.getPokerHand()));
            printHand(tp, firstHand);
        } else if (firstPokerHand.getPokerHand().ordinal() < secondPokerHand.getPokerHand().ordinal()) {
            System.out.println(String.format("Second hand won! With a %s", secondPokerHand.getPokerHand()));
            printHand(tp, secondHand);
        } else {
            determineSamePokerHandWinner(firstHand, secondHand, firstPokerHand, secondPokerHand, tp);
        }
    }

    private static void printHand(TextProcessor<? extends ListStrategy> tp, List<Card> firstHand) {
        List<String> cardOutput = firstHand.stream().map(Card::toString).collect(toList());
        tp.appendList(cardOutput);
        System.out.println(tp);
    }

    private static void determineSamePokerHandWinner(List<Card> firstHand, List<Card> secondHand, PokerHand firstPokerHand, PokerHand secondPokerHand, TextProcessor<? extends ListStrategy> tp) {
        switch (firstPokerHand.compare(firstHand, secondHand)) {
            case 1:
                System.out.println(String.format("First hand won! With a %s", firstPokerHand.getPokerHand()));
                printHand(tp, firstHand);
                break;
            case -1:
                System.out.println(String.format("Second hand won! With a %s", secondPokerHand.getPokerHand()));
                printHand(tp, secondHand);
                break;
            case 0:
                System.out.println(String.format("It's a draw with %s hand", firstPokerHand.getPokerHand()));
                printHand(tp, firstHand);
        }
    }
}
