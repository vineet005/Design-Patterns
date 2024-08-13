package AbstractFactory;

public class MainTheme {
    private Button button;
    private TextField textField;

    public MainTheme(GUIFactory factory){
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public void paint(){
        button.paint();
        textField.paint();
    }
    public static void main(String[] args) {
        GUIFactory dark = new DarkThemeFactory();
        GUIFactory light = new LightThemeFactory();

        MainTheme lmt = new MainTheme(light);
        MainTheme dmt = new MainTheme(dark);

        lmt.paint();
        dmt.paint();
    }
}
