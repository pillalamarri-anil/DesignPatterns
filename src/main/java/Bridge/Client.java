package Bridge;

import Bridge.Painters.*;
import Bridge.Shapes.*;

public class Client {

    public static void main(String[] args) {

        Painter basicPainter = new BasicPainter(new Cube());

        basicPainter.fillShape("Red");
        ((BasicPainter) basicPainter).drawShapeBorder("Black");

        Painter designer = new Designer(new Cone());

        designer.fillShape("Blue");
        ((Designer) designer).drawShapeBorder("White");
        ((Designer) designer).styleShape("Modern");
        ((Designer) designer).tessellateShape();
    }
}
