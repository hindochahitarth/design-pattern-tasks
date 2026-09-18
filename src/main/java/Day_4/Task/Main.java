package Day_4.Task;

import Day_4.Task.model.CustomerType;
import Day_4.Task.model.Order;
import Day_4.Task.system.OrderProcessor;

public class Main {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        // Process a VIP Order
        Order order = new Order("ORD-1001", CustomerType.VIP, 200.0);
        processor.process(order);

        Order order1 = new Order("ORD-1002", CustomerType.REGULAR, 200.0);
        processor.process(order1);

        Order order2 = new Order("ORD-1003", CustomerType.VIP, 200.0);
        processor.process(order2);

    }
}

