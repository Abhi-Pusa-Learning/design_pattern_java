package observerpattern.observer;

import observerpattern.Subject;

public class HexObserver extends Observer{

    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    public void update() {
        System.out.println("Inside hexobserver :: update() method");
    }
}
