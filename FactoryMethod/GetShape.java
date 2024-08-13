package FactoryMethod;

public class GetShape {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape shape = sf.getInstance("circle");
        shape.draw();
    }
}