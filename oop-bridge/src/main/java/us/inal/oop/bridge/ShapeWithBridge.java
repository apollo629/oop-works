package us.inal.oop.bridge;

/**
 * Created by alpereninal on 27/11/16.
 */
public abstract class ShapeWithBridge {

    protected Drawing myDrawing;
    abstract public void draw();
    ShapeWithBridge (Drawing drawing) {
        myDrawing= drawing;
    }
    protected void drawLine () {
        myDrawing.drawLine();
    }
    protected void drawCircle () {
        myDrawing.drawCircle();
    }

}
