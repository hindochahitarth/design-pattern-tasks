package Day_4.Task.model;

public class Order {
    public final String id;
    public final CustomerType customerType;
    public final double totalAmount;
    public boolean isAccepted = false;
    public double finalPrice;

    public Order(String id, CustomerType customerType, double totalAmount) {
        this.id = id;
        this.customerType = customerType;
        this.totalAmount = totalAmount;
    }
}

