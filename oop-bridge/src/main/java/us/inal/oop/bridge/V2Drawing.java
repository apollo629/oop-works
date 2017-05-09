package us.inal.oop.bridge;

import us.inal.oop.DP2;

/**
 * Created by alpereninal on 27/11/16.
 */
public class V2Drawing extends Drawing {
    @Override
    public void drawLine() {
        System.out.print("V2 Drawing is drawing line by using DP2");
        DP2.drawLine();
    }

    @Override
    public void drawCircle() {
        System.out.print("V2 Drawing is drawing circle by using DP2");
        DP2.drawCircle();
    }
}
