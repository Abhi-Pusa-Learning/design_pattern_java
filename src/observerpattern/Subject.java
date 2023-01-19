package observerpattern;

import observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();
    Integer state;

    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
