package Day_3.decorators;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public String getDescription(){
        return decoratedCoffee.getDescription()+" Milk";
    }
    public double getCost(){
        return decoratedCoffee.getCost()+0.5;
    }
}
