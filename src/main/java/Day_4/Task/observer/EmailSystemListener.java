package Day_4.Task.observer;

import Day_4.Task.model.Order;

public class EmailSystemListener implements OrderListener {
    @Override
    public void onOrderPlaced(Order order) {
        System.out.println("Email sent for order: " + order.id);
    }
}

