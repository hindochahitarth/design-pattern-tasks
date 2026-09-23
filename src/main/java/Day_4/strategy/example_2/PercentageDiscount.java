package Day_4.strategy.example_2;
class PercentageDiscount implements DiscountStrategy{
    private final double percent;
    public PercentageDiscount(double percent){
        this.percent=percent;
    }
    public String name(){
        return "percentage";
    }
    public double applyDiscount(double price){
        return price *(100.0 - percent)/100.0;
    }
}
