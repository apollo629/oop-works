package us.inal.oop.sol1;

import us.inal.oop.DP2;

/**
 * Created by alpereninal on 27/11/16.
 */
public class V2Rectangle extends Rectangle {

    @Override
    protected void drawLine() {
        System.out.print("V2 Rectangle is drawing by using DP2");
        DP2.drawLine();
    }
}
