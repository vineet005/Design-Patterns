package AbstractFactory;

public class LightTextField implements TextField{
    @Override
    public void paint() {
        System.out.println("TextField in Light Mode!");
    }
}
