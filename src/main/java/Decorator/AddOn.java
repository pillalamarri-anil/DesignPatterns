package Decorator;

public abstract  class  AddOn implements Beverage {
    
    protected  Beverage beverage;

    AddOn(Beverage beverage) {
        this.beverage = beverage;
    }

}
