package Day_4.Task.observer;
import Day_4.Task.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject {
    private final List<OrderListener> listeners = new ArrayList<>();

    public void attach(OrderListener listener) {
        listeners.add(listener);
    }

    public void detach(OrderListener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(Order order) {
        for (OrderListener listener : listeners) {
            listener.onOrderPlaced(order);
        }
    }
}

