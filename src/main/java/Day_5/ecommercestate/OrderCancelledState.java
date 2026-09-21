package Day_5.ecommercestate;

public class OrderCancelledState implements OrderState{
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Cannot proceed. Order is cancelled ");
    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Order is already cancelled");

    }
}
