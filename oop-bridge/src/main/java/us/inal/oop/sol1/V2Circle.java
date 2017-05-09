package us.inal.oop.sol1;

import us.inal.oop.DP1;

/**
 * Created by alpereninal on 27/11/16.
 */
public class V2Circle extends Circle {
    @Override
    protected void drawCircle() {
        System.out.print("V2 Circle is drawing by using DP2");
        DP1.draw_a_circle();
    }
}
