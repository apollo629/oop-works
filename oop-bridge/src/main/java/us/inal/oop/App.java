package us.inal.oop;

import us.inal.oop.bridge.*;
import us.inal.oop.sol1.*;
import us.inal.oop.sol1.Circle;
import us.inal.oop.sol1.Rectangle;
import us.inal.oop.sol2.V1CircleSol2;
import us.inal.oop.sol2.V1RectangleSol2;
import us.inal.oop.sol2.V2CircleSol2;
import us.inal.oop.sol2.V2RectangleSol2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("*****************************");
        System.out.println("Solution 1: ");
        Rectangle r1 = new V1Rectangle();
        r1.draw();

        Circle c1 = new V1Circle();
        c1.draw();

        System.out.println("-----------------------------");

        Rectangle r2 = new V2Rectangle();
        r2.draw();

        Circle c2 = new V2Circle();
        c2.draw();

        System.out.println("*****************************");
        System.out.println("Solution 2: ");

        Shape r1sol2 = new V1RectangleSol2();
        r1sol2.draw();

        Shape c1sol2 = new V1CircleSol2();
        c1sol2.draw();

        System.out.println("-----------------------------");

        Shape r2sol2 = new V2RectangleSol2();
        r2sol2.draw();

        Shape c2sol2 = new V2CircleSol2();
        c2sol2.draw();
        System.out.println("*****************************");
        System.out.println("Solution 3: ");

        Drawing v1d = new V1Drawing();
        ShapeWithBridge rectangle = new RectangleWithBridge(v1d);
        rectangle.draw();

        ShapeWithBridge circle = new CircleWithBridge(v1d);
        circle.draw();

        Drawing v2d = new V2Drawing();
        ShapeWithBridge rectangle2 = new RectangleWithBridge(v2d);
        rectangle2.draw();

        ShapeWithBridge circle2 = new CircleWithBridge(v2d);
        circle2.draw();




    }
}
