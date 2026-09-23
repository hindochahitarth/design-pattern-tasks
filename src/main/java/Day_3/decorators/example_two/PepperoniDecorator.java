package Day_3.decorators.example_two;
class PepperoniDecorator extends ToppingDecorator{
    public PepperoniDecorator(Pizza inner){
        super(inner);
    }
    public double cost(){
        return inner.cost()+2.00;
    }
    public String description(){
        return inner.description()+", pepperoni";
    }
}
