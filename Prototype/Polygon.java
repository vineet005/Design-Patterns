package Prototype;

public class Polygon extends Shape{
    public Polygon(){
        type = "Polygon";
    }
    @Override
    void draw() {
        System.out.println("Drawing Using Polygon..");
    }
}
