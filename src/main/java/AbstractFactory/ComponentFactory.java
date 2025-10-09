package AbstractFactory;

import AbstractFactory.Components.Button.Button;
import AbstractFactory.Components.DropDown.DropDown;
import AbstractFactory.Components.Menu.Menu;

public interface ComponentFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
