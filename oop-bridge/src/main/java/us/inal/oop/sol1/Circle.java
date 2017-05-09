package us.inal.oop.sol1;

import us.inal.oop.Shape;

/**
 * Created by alpereninal on 27/11/16.
 */
public abstract class Circle implements Shape {

    @Override
    public void draw() {
        drawCircle();
    }


    abstract protected void drawCircle();

}
