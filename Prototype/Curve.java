package Prototype;

public class Curve extends Shape{
    public Curve(){
        type = "Curve";
    }
    @Override
    void draw() {
        System.out.println("Drawing Using Curve..");
    }
}
