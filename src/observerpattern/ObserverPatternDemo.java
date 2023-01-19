package observerpattern;

import observerpattern.observer.BinaryObserver;
import observerpattern.observer.HexObserver;
import observerpattern.observer.Observer;
import observerpattern.observer.OctalObserver;

public class ObserverPatternDemo {
    public void execute(){
        Subject subject = new Subject();
        new HexObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
