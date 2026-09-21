package Day_5.ecommercestate;

public class OrderShippedState implements OrderState{

    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Order has been shipped..Moving to delivery");
        orderContext.setOrderState(new OrderDeliveredState());
    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Cannot cancel . Order has been already shipped");

    }
}
