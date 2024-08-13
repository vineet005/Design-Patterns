package Decorator;

public class BoldText implements Text {
    @Override
    public String editText() {
        return "**" + new Text() + "**";
    }
}
