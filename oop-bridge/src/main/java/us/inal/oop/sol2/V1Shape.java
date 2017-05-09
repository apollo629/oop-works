package us.inal.oop.sol2;

import us.inal.oop.Shape;
import us.inal.oop.DP1;

/**
 * Created by alpereninal on 27/11/16.
 */
public abstract class V1Shape implements Shape{

    public void drawLine(){
        DP1.draw_a_line();
    }

    public void drawCircle(){
        DP1.draw_a_circle();
    }


}
