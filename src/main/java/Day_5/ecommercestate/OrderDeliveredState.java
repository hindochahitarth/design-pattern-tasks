package Day_5.ecommercestate;

public class OrderDeliveredState implements OrderState{
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Order is already delivered");
    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Cant' cancel. Order has already been delivered");
    }
}
