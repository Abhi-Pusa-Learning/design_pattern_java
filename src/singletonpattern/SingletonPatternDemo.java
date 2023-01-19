package singletonpattern;

public class SingletonPatternDemo {
    public void execute(){
        // this will throw exception as this is not allowed
        //SingleObject singleObject = new SingleObject();

        // this will work
        SingleObject singleObject1 = SingleObject.getInstance();
        singleObject1.showMessage();
    }
}
