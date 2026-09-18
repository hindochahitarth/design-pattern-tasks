package Day_4.Task.strategy;
public class MemberDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% discount
    }
}

