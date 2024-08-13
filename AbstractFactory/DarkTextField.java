package AbstractFactory;

public class DarkTextField implements TextField{
    @Override
    public void paint() {
        System.out.println("Text Field in Dark Mode!");
    }
}
