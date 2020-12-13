package utils;

import card.Card;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Utils {

    public static List<Integer> getDescendingSortedValues(List<Card> hand) {
        return hand.stream().map(v -> v.getValue().ordinal()).sorted((a, b) -> b - a).collect(toList());
    }

    public static int compareCardValues(List<Integer> firstHandValues, List<Integer> secondHandValues) {
        if (firstHandValues.size() == 1 && secondHandValues.size() == 1) {
            return Integer.compare(firstHandValues.get(0), secondHandValues.get(0));
        }
        if (firstHandValues.get(0) > secondHandValues.get(0)) {
            return 1;
        }
        if (firstHandValues.get(0) < secondHandValues.get(0)) {
            return -1;
        }
        firstHandValues.remove(0);
        secondHandValues.remove(0);
        return compareCardValues(firstHandValues, secondHandValues);
    }
}
