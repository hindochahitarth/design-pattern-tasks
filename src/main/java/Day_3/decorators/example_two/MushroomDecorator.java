package Day_3.decorators.example_two;
class MushroomDecorator extends ToppingDecorator{
    public MushroomDecorator(Pizza inner){
        super(inner);
    }
    public double cost(){
        return inner.cost()+1.00;
    }
    public String description(){
        return inner.description()+", mushrooms";
    }
}
