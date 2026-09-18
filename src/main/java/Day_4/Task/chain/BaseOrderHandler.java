package Day_4.Task.chain;

import Day_4.Task.model.Order;

public abstract class BaseOrderHandler implements OrderHandler {
    private OrderHandler next;

    @Override
    public void setNext(OrderHandler next) {
        this.next = next;
    }

    protected boolean checkNext(Order order) {
        if (next == null) {
            return true;
        }
        return next.handle(order);
    }
}

