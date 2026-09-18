package Day_4.Task.strategy;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount; // No discount
    }
}

