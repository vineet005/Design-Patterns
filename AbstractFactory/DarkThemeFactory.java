package AbstractFactory;

public class DarkThemeFactory extends GUIFactory{
    @Override
    Button createButton() {
        System.out.println("Dark Button Created!");
        return new DarkButton();
    }

    @Override
    TextField createTextField() {
        System.out.println("Dark TextField Created!");
        return new DarkTextField();
    }
}
