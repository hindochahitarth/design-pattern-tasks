package Day_5.ecommercestate;

public class OrderPlacedState implements OrderState {

    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Order has been placed.Moved to shipping State.");

    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Order has been Cancelled");
    }
}
