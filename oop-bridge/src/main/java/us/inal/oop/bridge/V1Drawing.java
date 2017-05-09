package us.inal.oop.bridge;

import us.inal.oop.DP1;

/**
 * Created by alpereninal on 27/11/16.
 */
public class V1Drawing extends Drawing {

    public void drawLine () {
        System.out.print("V1 Drawing is drawing line by using DP1");
        DP1.draw_a_line();
    }
    public void drawCircle () {
        System.out.print("V1 Drawing is drawing circle by using DP1");
        DP1.draw_a_circle();
    }

}
