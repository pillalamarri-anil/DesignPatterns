package Bridge.Painters;

import Bridge.Shapes.Cube;
import DesignPatterns.BridgePattern.Shapes.Shape;

public class BasicPainter extends Painter{

    public BasicPainter(Cube shape) {
        super(shape);
    }

    @Override
    public void fillShape(String color) {
        shape.fill(color);
    }

    public void drawShapeBorder(String color) {
        shape.drawBorder(color);
    }

}
