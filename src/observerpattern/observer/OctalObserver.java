package observerpattern.observer;

import observerpattern.Subject;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    public void update() {
        System.out.println("Inside OctalObserver :: update() method");
    }
}
