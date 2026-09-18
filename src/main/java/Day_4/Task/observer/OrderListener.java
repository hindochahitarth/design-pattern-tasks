package Day_4.Task.observer;

import Day_4.Task.model.Order;

public interface OrderListener {
    void onOrderPlaced(Order order);
}

