package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: DesignPattern
 * @Description: 具体主题
 * @Author: kris
 * @Create: 2023-08-18 11:25
 **/

public class ConcreteSubject implements Subject{
    private int state;
    List<Observer> observers = new ArrayList<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o: observers
             ) {
            o.update(this.state);
        }
    }
}
