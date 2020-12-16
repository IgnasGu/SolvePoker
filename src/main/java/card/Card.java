package card;

import enums.Symbol;
import enums.Value;

public class Card {

    private Symbol color;
    private Value value;

    public Card(Symbol color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Symbol getColor() {
        return color;
    }

    public void setColor(Symbol color) {
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
