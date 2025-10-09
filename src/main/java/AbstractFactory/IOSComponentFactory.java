package AbstractFactory;

import AbstractFactory.Components.Button.IOSButton;
import AbstractFactory.Components.DropDown.DropDown;
import AbstractFactory.Components.DropDown.IOSDropDown;
import AbstractFactory.Components.Menu.IOSMenu;
import AbstractFactory.Components.Menu.Menu;
import AbstractFactory.Components.Button.Button;

public class IOSComponentFactory implements ComponentFactory {

    public IOSComponentFactory() {
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

}
