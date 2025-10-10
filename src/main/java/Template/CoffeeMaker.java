package Template;

public class CoffeeMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Brewing coffee grounds");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
