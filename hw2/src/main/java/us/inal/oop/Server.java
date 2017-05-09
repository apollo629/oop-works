package us.inal.oop;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by alpereninal on 09/10/16.
 */
public class Server {

    public static void main(String[] arg) {

        Car car = null;

        try {

            ServerSocket socketConnection = new ServerSocket(11111);

            System.out.println("Server Waiting");

            Socket pipe = socketConnection.accept();

            ObjectInputStream serverInputStream = new
                    ObjectInputStream(pipe.getInputStream());

            ObjectOutputStream serverOutputStream = new
                    ObjectOutputStream(pipe.getOutputStream());

            car = (Car)serverInputStream.readObject();

            System.out.println("Server is received car object. Car:" + car.toString());

            car.setColor("Reeeeeeed");
            car.setPlateNo("1903AA45");
            car.setModel("Mustang");

            System.out.println("Server is modified the car object. Modified Car:" + car.toString());
            System.out.println("Server is writing modified car object to client back");
            serverOutputStream.writeObject(car);

            System.out.println("Server is closing");

            serverInputStream.close();
            serverOutputStream.close();


        }  catch(Exception e) {System.out.println(e);
        }
    }

}
