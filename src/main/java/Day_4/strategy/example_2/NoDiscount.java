package Day_4.strategy.example_2;
class NoDiscount implements DiscountStrategy{

    public String name(){
        return "none";
    }
    public double applyDiscount(double price){
        return price;
    }
}
