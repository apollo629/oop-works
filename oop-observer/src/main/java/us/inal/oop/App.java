package us.inal.oop;

import java.util.Map;

/**
 *
 * Created by alpereninal on 18/12/16.
 */
public class App 
{
    public static void main( String[] args ) {


        Map<Integer,Observable> doors;
        DoorFactory doorFactory = new DoorFactoryImpl();
        doors = doorFactory.createDoors(8);

        Observer panel = new Panel(doors);

        StateChanger changer = new StateChanger(doors);
        Thread t = new Thread(changer);
        t.start();

    }
}
