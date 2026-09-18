package Day_4.Task.chain;

import Day_4.Task.model.Order;

public class InventoryHoldHandler extends BaseOrderHandler {
    @Override
    public boolean handle(Order order) {
        System.out.println("Holding inventory for order: " + order.id);
        return checkNext(order);
    }
}
