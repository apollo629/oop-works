package us.inal.oop.bridge;


/**
 * Created by alpereninal on 27/11/16.
 */
public class RectangleWithBridge extends ShapeWithBridge {

    public RectangleWithBridge(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.print("Rectangle with bridge pattern, ");
        drawLine();
    }

}
