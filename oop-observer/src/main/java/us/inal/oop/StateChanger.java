package us.inal.oop;

import java.util.Map;

/**
 * Created by alpereninal on 18/12/16.
 */
public class StateChanger implements Runnable {

    public Map<Integer, Observable> observables;

    public StateChanger(Map<Integer, Observable> observables) {
        this.observables = observables;
    }

    @Override
    public void run() {
        while(true) {
            int randomId = (int) (Math.random() * observables.size());
            int randomSleep = (int) (Math.random() * 6000 + 100);
            boolean state = (int) (Math.random() * 2) == 0 ? Boolean.FALSE : Boolean.TRUE;
            try {
                observables.get(randomId).setState(state);
                Thread.sleep(randomSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
