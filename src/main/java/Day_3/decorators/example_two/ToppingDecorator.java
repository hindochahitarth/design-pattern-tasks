package Day_3.decorators.example_two;
abstract class ToppingDecorator implements Pizza{
    protected final Pizza inner;

    protected ToppingDecorator(Pizza inner){
        this.inner=inner;
    }
    public double cost(){
        return inner.cost();
    }
    public String description(){
        return inner.description();
    }

}
