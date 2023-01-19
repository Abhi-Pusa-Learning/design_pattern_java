package abstractfactorypattern;

public class FactoryProducer {
    public AbstractFactory getAbstractFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
