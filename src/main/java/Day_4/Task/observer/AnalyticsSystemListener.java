package Day_4.Task.observer;

import Day_4.Task.model.Order;

public class AnalyticsSystemListener implements OrderListener {
    @Override
    public void onOrderPlaced(Order order) {
        System.out.println("Analytics tracked for order: " + order.id);
    }
}

