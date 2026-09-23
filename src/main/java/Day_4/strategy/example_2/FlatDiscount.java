package Day_4.strategy.example_2;
class FlatDiscount implements DiscountStrategy{
    private final double amount;
    public FlatDiscount(double amount){
        this.amount=amount;
    }
    public String name(){
        return "flat";
    }
    public double applyDiscount(double price){
        double reduced=price-amount;
        return reduced > 0?reduced:0.0;
    }
}
