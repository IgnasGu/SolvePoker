package list;

public class MarkdownListStrategy implements ListStrategy {

    @Override
    public void addListItem(StringBuilder stringBuilder, String item) {
        stringBuilder.append(item)
                .append(System.lineSeparator());
    }
}
