package Decorator;

public class ItalicText extends AbstractText{
    public ItalicText(Text newText) {
        super(newText);
    }

    @Override
    public String editText() {
        return "*" + NEW_TEXT.editText() + "*";
    }
}
