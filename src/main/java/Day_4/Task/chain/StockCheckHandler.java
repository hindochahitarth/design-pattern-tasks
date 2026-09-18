package Day_4.Task.chain;

import Day_4.Task.model.Order;

public class StockCheckHandler extends BaseOrderHandler {
    @Override
    public boolean handle(Order order) {
        System.out.println("Checking stock for order: " + order.id);
        // Returns false to reject order, or checks next handler if passing
        return checkNext(order);
    }
}

