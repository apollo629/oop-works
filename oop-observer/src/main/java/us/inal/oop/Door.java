package us.inal.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alpereninal on 18/12/16.
 */
public class Door implements Observable {

    private final int id;
    public boolean state = false;
    List<Observer> observers = new ArrayList<>();

    public Door(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Door{" +
                "state=" + state +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean getState() {
        return state;
    }

    @Override
    public void setState(boolean state) {
        this.state = state;
        stateChange();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void stateChange() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
