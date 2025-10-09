package AbstractFactory;

import AbstractFactory.Components.Button.*;
import AbstractFactory.Components.DropDown.*;
import AbstractFactory.Components.Menu.*;

public class AnroidComponentFactory implements ComponentFactory {
    public Button createButton()
    {
        return new AnroidButton();
    }

    public DropDown createDropDown()
    {
        return new AnroidDropDown();
    }
    
    public Menu createMenu()
    {
        return new AnroidMenu();
    }

}
