package prototypepattern;

import prototypepattern.shape.Circle;
import prototypepattern.shape.Rectangle;
import prototypepattern.shape.Shape;
import prototypepattern.shape.Square;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<Integer, Shape> hashMap = new HashMap<>();

    public static Shape getShape(Integer id){
        Shape cachedShape = hashMap.get(id);
        return (Shape) cachedShape.clone();
    }

    public static void load(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId(1);
        hashMap.put(rectangle.getId(),rectangle);
        Square square = new Square();
        square.setId(2);
        hashMap.put(square.getId(),square);
        Circle circle = new Circle();
        circle.setId(3);
        hashMap.put(circle.getId(), circle);
    }
}
