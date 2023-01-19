package factorypattern;

public class ShapeFactoryDemo {
    public void execute(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
