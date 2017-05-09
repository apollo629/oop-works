package us.inal.oop.sol2;

import us.inal.oop.Shape;
import us.inal.oop.DP2;

/**
 * Created by alpereninal on 27/11/16.
 */
public abstract class V2Shape implements Shape{

    public void drawLine(){
        DP2.drawLine();
    }

    public void drawCircle(){
        DP2.drawCircle();
    }

}
