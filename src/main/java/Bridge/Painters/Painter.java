package Bridge.Painters;

import Bridge.Shapes.*;

public abstract class Painter {

    Shape shape = null;

    Painter(Shape shape){
        this.shape = shape;
    }

    public abstract void fillShape(String color);
}
