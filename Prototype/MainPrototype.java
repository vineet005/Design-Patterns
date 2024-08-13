package Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloned1 =  ShapeCache.getShape("1");
        System.out.println("Shape : " + cloned1.getType());

        Shape cloned2 =  ShapeCache.getShape("2");
        System.out.println("Shape : " + cloned2.getType());
    }
}
