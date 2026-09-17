package Day_3.decorators;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee=decoratedCoffee;
    }
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }
    public double getCost(){
        return decoratedCoffee.getCost();
    }
}
