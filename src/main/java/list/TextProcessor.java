package list;

import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {
    private StringBuilder sb = new StringBuilder();
    private LS listStrategy;

    public TextProcessor(Supplier<? extends LS> ctor) {
        listStrategy = ctor.get();
    }

    public void appendList(List<String> items) {
        items.forEach(item -> listStrategy.addListItem(sb, item));
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
