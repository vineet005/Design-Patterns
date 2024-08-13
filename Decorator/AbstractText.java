package Decorator;

public abstract class AbstractText implements Text{
    protected Text NEW_TEXT;
    public AbstractText(Text newText){
        this.NEW_TEXT = newText;
    }
}
