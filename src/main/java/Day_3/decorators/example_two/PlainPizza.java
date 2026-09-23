package Day_3.decorators.example_two;

class PlainPizza implements Pizza {
    @Override
    public double cost() {
        return 5.00;
    }

    @Override
    public String description() {
        return "Plain pizza";
    }
}
