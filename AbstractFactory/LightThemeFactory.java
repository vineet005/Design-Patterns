package AbstractFactory;

public class LightThemeFactory extends GUIFactory{
    @Override
    Button createButton() {
        System.out.println("Light Button Created!");
        return new LightButton();

    }

    @Override
    TextField createTextField() {
        System.out.println("Light TextField Created!");
        return new LightTextField();
    }
}
