package Decorator;

public class UnderlineText extends AbstractText{
    public UnderlineText(Text newText) {
        super(newText);
    }

    @Override
    public String editText() {
        return "__"+NEW_TEXT.editText()+"__";
    }
}
