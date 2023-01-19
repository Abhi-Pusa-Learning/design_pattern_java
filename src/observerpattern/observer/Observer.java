package observerpattern.observer;

import observerpattern.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
