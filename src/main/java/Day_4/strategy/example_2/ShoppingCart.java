package Day_4.strategy.example_2;
class ShoppingCart {
    private DiscountStrategy strategy = new NoDiscount();
    private int checkouts = 0;

    public ShoppingCart() {
    }

    public boolean setNoDiscount() {
        strategy = new NoDiscount();
        return true;
    }

    public boolean setPercentageDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            return false;
        }
        strategy = new PercentageDiscount(percent);
        return true;
    }

    public boolean setFlatDiscount(double amount) {
        if (amount < 0) {
            return false;
        }
        strategy = new FlatDiscount(amount);
        return true;
    }

    public String currentStrategy() {
        return strategy.name();
    }

    public double checkout(double price) {
        if (price < 0) {
            return -1.0;
        }
        checkouts++;
        return strategy.applyDiscount(price);
    }

    public String receipt(double price) {
        if (price < 0) {
            return "INVALID";
        }
        return String.format(java.util.Locale.US, "Original: $%.2f | Final: $%.2f",
                price, checkout(price));
    }

    public int checkoutCount() {
        return checkouts;
    }
}

