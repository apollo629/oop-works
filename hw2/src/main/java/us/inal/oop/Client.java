package us.inal.oop;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by alpereninal on 09/10/16.
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        try {
            Car focus = new Car("Ford", "Focus", 2008, "Grey", "OOPHW2");
            Car modifiedFocus = new Car();

            System.out.println("Client creates a car object:  " + focus.toString());

            Socket socketConnection = new Socket("127.0.0.1", 11111);


            ObjectOutputStream clientOutputStream = new
                    ObjectOutputStream(socketConnection.getOutputStream());
            ObjectInputStream clientInputStream = new
                    ObjectInputStream(socketConnection.getInputStream());

            System.out.println("Client sends car object to server");
            clientOutputStream.writeObject(focus);

            modifiedFocus = (Car)clientInputStream.readObject();
            System.out.println("Client receives the modified car object from server");

            System.out.println("Modified car object: " + modifiedFocus.toString());


            System.out.println("Client is closing");
            clientOutputStream.close();
            clientInputStream.close();

        } catch (Exception e) {System.out.println(e); }
    }
}
