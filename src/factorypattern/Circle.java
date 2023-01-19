package factorypattern;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.print("Inside circle :: draw() method");
    }
}
