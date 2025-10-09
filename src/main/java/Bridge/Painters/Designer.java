package Bridge.Painters;

import Bridge.Shapes.*;

public class Designer extends Painter{

    public Designer(Shape shape) {
        super(shape);
    }

    public void styleShape(String design) {
        shape.style(design);
    }

    public void tessellateShape() {
        shape.tessellate();
    }

    @Override
    public void fillShape(String color) {
        shape.fill(color);
    }

    public void drawShapeBorder(String color) {
        shape.drawBorder(color);
    }
}
