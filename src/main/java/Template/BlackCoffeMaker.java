package Template;

public class BlackCoffeMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Brewing with coffee nuts");
    }

    @Override
    void addCondiments() {
        // nothing
    }
}
