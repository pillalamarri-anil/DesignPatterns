package Template;

public class TeaMaker extends BeverageMaker{
    @Override
    protected void brew() {
        System.out.println("brewing with tea powder");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Ginger and sugar");
    }
}
