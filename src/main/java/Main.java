import card.Card;
import compareStrategies.CompareStrategy;
import compareStrategies.ComparingStrategyProvider;
import enums.CardSymbol;
import enums.CardValue;
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
                new Card(CardSymbol.CLUB, CardValue.SIX),
                new Card(CardSymbol.DIAMOND, CardValue.TWO),
                new Card(CardSymbol.CLUB, CardValue.FOUR),
                new Card(CardSymbol.HEART, CardValue.THREE),
                new Card(CardSymbol.CLUB, CardValue.FIVE)
        );

        List<Card> secondHand = asList(
                new Card(CardSymbol.CLUB, CardValue.EIGHT),
                new Card(CardSymbol.DIAMOND, CardValue.NINE),
                new Card(CardSymbol.CLUB, CardValue.JACK),
                new Card(CardSymbol.HEART, CardValue.TEN),
                new Card(CardSymbol.CLUB, CardValue.QUEEN)
        );

        PokerHand firstPokerHand = PokerHandFactory.getPokerHand(firstHand);
        PokerHand secondPokerHand = PokerHandFactory.getPokerHand(secondHand);

        if (firstPokerHand.getName().ordinal() > secondPokerHand.getName().ordinal()) {
            System.out.println(String.format("First hand won! With a %s", firstPokerHand.getName()));
            printHand(tp, firstHand);
        } else if (firstPokerHand.getName().ordinal() < secondPokerHand.getName().ordinal()) {
            System.out.println(String.format("Second hand won! With a %s", secondPokerHand.getName()));
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
        ComparingStrategyProvider csp = new ComparingStrategyProvider();
        CompareStrategy cs = csp.provideCompareStrategy(firstHand, secondHand);

        switch (cs.compare(firstHand, secondHand)) {
            case 1:
                System.out.println(String.format("First hand won! With a %s", firstPokerHand.getName()));
                printHand(tp, firstHand);
                break;
            case -1:
                System.out.println(String.format("Second hand won! With a %s", secondPokerHand.getName()));
                printHand(tp, secondHand);
                break;
            case 0:
                System.out.println(String.format("It's a draw with %s hand", firstPokerHand.getName()));
                printHand(tp, firstHand);
        }
    }
}
