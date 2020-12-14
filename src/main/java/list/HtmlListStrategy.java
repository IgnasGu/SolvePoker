package list;

public class HtmlListStrategy implements ListStrategy {

    @Override
    public void addListItem(StringBuilder stringBuilder, String item) {
        stringBuilder.append("  <li>")
                .append(item)
                .append("</li>")
                .append(System.lineSeparator());
    }
}
