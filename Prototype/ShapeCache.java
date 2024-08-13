package Prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeID){
        Shape cachedShape = shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Polygon polygon = new Polygon();
        polygon.setId("1");
        shapeMap.put(polygon.getId(), polygon);

        Curve curve = new Curve();
        curve.setId("2");
        shapeMap.put(curve.getId(), curve);
    }
}
