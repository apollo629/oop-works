package us.inal.oop.sol1;

import us.inal.oop.Shape;

/**
 * Created by alpereninal on 22/11/16.
 */
public abstract class Rectangle implements Shape {

    @Override
    public void draw() {
        drawLine();
    }


    abstract protected void drawLine();
}
