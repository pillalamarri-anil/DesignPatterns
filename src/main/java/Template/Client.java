package Template;

public class Client {

    public static void main(String[] args) {

        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.PrepareBevarage();

        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.PrepareBevarage();

        BeverageMaker blackCoffeeMaker = new BlackCoffeMaker();
        blackCoffeeMaker.PrepareBevarage();

        BeverageMaker blackTeaMaker = new BlackTeaMaker();
        blackTeaMaker.PrepareBevarage();


    }
}
