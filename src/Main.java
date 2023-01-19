import abstractfactorypattern.AbstractFactoryPatternDemo;
import adapterpattern.AdaperPatternDemo;
import builderpattern.MealBuilder;
import builderpattern.MealBuilderPatternDemo;
import commandpattern.CommandPatternDemo;
import factorypattern.ShapeFactoryDemo;
import filterpattern.FilterPatternDemo;
import observerpattern.ObserverPatternDemo;
import prototypepattern.PrototypePatternDemo;
import singletonpattern.SingleObject;
import singletonpattern.SingletonPatternDemo;

public class Main {
    public static void main(String[] args) {
        // factory pattern example
        // System.out.println("Hello world!");
        // ShapeFactoryDemo shapeFactoryDemo = new ShapeFactoryDemo();
        // shapeFactoryDemo.execute();

        // abstract factory pattern example
        // AbstractFactoryPatternDemo abstractFactoryPatternDemo = new AbstractFactoryPatternDemo();
        // abstractFactoryPatternDemo.execute();

        // singleton pattern example
        // SingletonPatternDemo singletonPatternDemo = new SingletonPatternDemo();
        // singletonPatternDemo.execute();

        // builder pattern demo
        // MealBuilderPatternDemo mealBuilderPatternDemo = new MealBuilderPatternDemo();
        // mealBuilderPatternDemo.execute();

        // prototype pattern demo
        // PrototypePatternDemo prototypePatternDemo = new PrototypePatternDemo();
        // prototypePatternDemo.execute();

        // adapter pattern demo
        // AdaperPatternDemo adaperPatternDemo = new AdaperPatternDemo();
        // adaperPatternDemo.execute();

        // filter pattern demo
        // FilterPatternDemo filterPatternDemo = new FilterPatternDemo();
        // filterPatternDemo.execute();

        // command pattern demo
        // CommandPatternDemo commandPatternDemo = new CommandPatternDemo();
        // commandPatternDemo.execute();

        // observer pattern demo
        ObserverPatternDemo observerPatternDemo = new ObserverPatternDemo();
        observerPatternDemo.execute();
    }
}