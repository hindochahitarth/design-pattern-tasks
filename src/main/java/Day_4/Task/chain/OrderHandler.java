package Day_4.Task.chain;

import Day_4.Task.model.Order;

public interface OrderHandler {
    void setNext(OrderHandler next);
    boolean handle(Order order);
}

