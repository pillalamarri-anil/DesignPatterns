package AbstractFactory;

public class Client {

    public static void main(String[] args) {

        ComponentFactory componentFactory = CreateComponentFactory("Anroid");
        componentFactory.createButton().render();
        componentFactory.createDropDown().render();
        componentFactory.createMenu().render();
    }

    static ComponentFactory CreateComponentFactory(String platForm)
    {
        if(platForm == "Anroid")
        {
            return new AnroidComponentFactory();
        }
        else if(platForm == "IOS")
        {
            return new IOSComponentFactory();
        }
        else
        {
            return null;
        }
    }
}
