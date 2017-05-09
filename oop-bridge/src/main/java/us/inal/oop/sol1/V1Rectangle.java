package us.inal.oop.sol1;

import us.inal.oop.DP1;

/**
 * Created by alpereninal on 22/11/16.
 */
public class V1Rectangle extends Rectangle {

    @Override
    protected void drawLine() {
        System.out.print("V1 Rectangle is drawing by using DP1");
        DP1.draw_a_line();
    }
}
