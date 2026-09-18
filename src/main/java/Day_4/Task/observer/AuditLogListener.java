package Day_4.Task.observer;

import Day_4.Task.model.Order;

public class AuditLogListener implements OrderListener {
    @Override
    public void onOrderPlaced(Order order) {
        System.out.println("Audit log saved for order: " + order.id);
    }
}

