package AbstractFactory;

public class LightButton implements Button{
    @Override
    public void paint() {
        System.out.println("Button in Light Mode!");
    }
}


