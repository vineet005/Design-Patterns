package Decorator;

public class BoldText extends AbstractText{
    public BoldText(Text text){
        super(text);
    }

    @Override
    public String editText() {
        return "**"+NEW_TEXT.editText()+"**";
    }
}
