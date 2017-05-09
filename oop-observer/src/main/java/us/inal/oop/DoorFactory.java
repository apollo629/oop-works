package us.inal.oop;

import java.util.Map;

/**
 * Created by alpereninal on 18/12/16.
 */
public interface DoorFactory {

    public Door createDoor();

    public Door createDoor(int number);

    public Map<Integer, Observable> createDoors(int number);

}
