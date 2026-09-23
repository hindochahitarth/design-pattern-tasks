package Day_3.decorators.example_two;
class CheeseDecorator extends ToppingDecorator{
    public CheeseDecorator(Pizza inner){
        super(inner);
    }
    public double cost(){
        return inner.cost()+1.50;
    }
    public String description(){
        return inner.description()+", cheese";
    }

}
