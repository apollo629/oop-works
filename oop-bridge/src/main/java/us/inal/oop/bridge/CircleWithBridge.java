package us.inal.oop.bridge;

/**
 * Created by alpereninal on 27/11/16.
 */
public class CircleWithBridge extends ShapeWithBridge {

    public CircleWithBridge(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.print("Circle with bridge pattern, ");
        drawCircle();
    }
}
