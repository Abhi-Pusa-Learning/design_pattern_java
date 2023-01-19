package prototypepattern;

import prototypepattern.shape.Shape;

public class PrototypePatternDemo {
    public void execute(){
        ShapeCache.load();
        Shape clonedShape1 = ShapeCache.getShape(1);
        System.out.println(clonedShape1.getType());
        Shape clonedShape2 = ShapeCache.getShape(2);
        System.out.println(clonedShape2.getType());
        Shape clonedShape3 = ShapeCache.getShape(3);
        System.out.println(clonedShape3.getType());
    }
}
