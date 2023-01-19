package factorypattern;

public class ShapeFactory {
    private String RECTANGLE = "RECTANGLE";
    private String SQUARE = "SQUARE";
    private String CIRCLE = "CIRCLE";

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase(RECTANGLE)){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase(SQUARE)){
            return new Square();
        }else if(shapeType.equalsIgnoreCase(CIRCLE)){
            return new Circle();
        }else{
            return null;
        }
    }
}
