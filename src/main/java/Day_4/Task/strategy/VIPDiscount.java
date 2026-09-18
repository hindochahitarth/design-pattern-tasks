package Day_4.Task.strategy;

public class VIPDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.80; // 20% discount
    }
}

