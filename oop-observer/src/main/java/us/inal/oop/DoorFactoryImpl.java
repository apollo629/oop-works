package us.inal.oop;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by alpereninal on 18/12/16.
 */
public class DoorFactoryImpl implements DoorFactory {


    @Override
    public Door createDoor() {
        int random = (int) (Math.random() * 1000 + 1);
        return new Door(random);
    }

    @Override
    public Door createDoor(int number) {
        return new Door(number);
    }

    @Override
    public Map<Integer, Observable> createDoors(int number) {
        Map<Integer, Observable> doors = new HashMap<>();
        IntStream.range(0, number).forEach(
                nbr -> doors.put(nbr, createDoor(nbr))
        );

        return doors;
    }

}
