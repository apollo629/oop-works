package us.inal.oop;

/**
 * Created by alpereninal on 18/12/16.
 */
public interface Observable {

    public void attach(Observer o);

    public void detach(Observer o);

    public void stateChange();

    public void setState(boolean state);

    public boolean getState();

    public int getId();

    public void notifyObservers();


}
