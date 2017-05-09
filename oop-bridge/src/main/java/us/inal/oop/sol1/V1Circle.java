package us.inal.oop.sol1;

import us.inal.oop.DP1;

/**
 * Created by alpereninal on 27/11/16.
 */
public class V1Circle extends Circle {



    @Override
    protected void drawCircle() {
        System.out.print("V1 Circle is drawing by using DP1");
        DP1.draw_a_circle();
    }


}
