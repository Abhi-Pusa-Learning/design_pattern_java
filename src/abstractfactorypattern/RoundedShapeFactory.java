package abstractfactorypattern;

public class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSqaure();
        }else{
            return null;
        }
    }
}
