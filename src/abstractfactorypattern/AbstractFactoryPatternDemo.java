package abstractfactorypattern;

public class AbstractFactoryPatternDemo {
    public void execute(){
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory abstractFactory = factoryProducer.getAbstractFactory(false);
        Shape rectangle = abstractFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = abstractFactory.getShape("SQUARE");
        square.draw();
        AbstractFactory abstractFactory1 = factoryProducer.getAbstractFactory(true);
        Shape roundedRectangle = abstractFactory1.getShape("RECTANGLE");
        roundedRectangle.draw();
        Shape roundedSquare = abstractFactory1.getShape("SQUARE");
        roundedSquare.draw();
    }
}
