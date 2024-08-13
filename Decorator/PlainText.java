package Decorator;

public class PlainText implements Text {
    private final String NEW_TEXT;

    public PlainText(String text){
        this.NEW_TEXT = text;
    }

    @Override
    public String editText() {
        return NEW_TEXT;
    }
}
