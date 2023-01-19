package prototypepattern.shape;

public class Rectangle extends Shape{

    public Rectangle(){
        type =  "RECTANGLE";
    }

    @Override
    void draw() {
        System.out.println("Inside rectangle :: draw() method");
    }
}
