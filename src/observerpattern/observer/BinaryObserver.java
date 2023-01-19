package observerpattern.observer;

import observerpattern.Subject;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    public void update() {
        System.out.println("Inside BinaryObserver :: update() method");
    }
}
