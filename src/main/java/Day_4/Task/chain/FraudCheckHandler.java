package Day_4.Task.chain;

import Day_4.Task.model.Order;

public class FraudCheckHandler extends BaseOrderHandler {
    @Override
    public boolean handle(Order order) {
        System.out.println("Running fraud check for order: " + order.id);
        return checkNext(order);
    }
}

