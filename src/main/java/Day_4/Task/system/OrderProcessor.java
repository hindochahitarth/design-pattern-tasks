package Day_4.Task.system;

import Day_4.Task.chain.FraudCheckHandler;
import Day_4.Task.chain.InventoryHoldHandler;
import Day_4.Task.chain.OrderHandler;
import Day_4.Task.chain.StockCheckHandler;
import Day_4.Task.model.Order;
import Day_4.Task.observer.AnalyticsSystemListener;
import Day_4.Task.observer.AuditLogListener;
import Day_4.Task.observer.EmailSystemListener;
import Day_4.Task.observer.OrderSubject;
import Day_4.Task.strategy.DiscountFactory;
import Day_4.Task.strategy.DiscountStrategy;

public class OrderProcessor {
    private final OrderHandler validationChain;
    private final OrderSubject orderSubject;

    public OrderProcessor() {
        // Wire Chain of Responsibility
        OrderHandler stock = new StockCheckHandler();
        OrderHandler fraud = new FraudCheckHandler();
        OrderHandler inventory = new InventoryHoldHandler();

        stock.setNext(fraud);
        fraud.setNext(inventory);
        this.validationChain = stock;

        // Wire Observers
        this.orderSubject = new OrderSubject();
        orderSubject.attach(new EmailSystemListener());
        orderSubject.attach(new AnalyticsSystemListener());
        orderSubject.attach(new AuditLogListener());
    }

    public void process(Order order) {
        System.out.println("--- Processing Order " + order.id + " ---");

        // 1. Chain of Responsibility Checks
        if (!validationChain.handle(order)) {
            System.out.println("Order " + order.id + " failed validation checks.");
            return;
        }
        order.isAccepted = true;

        // 2. Strategy Pattern Evaluation
        DiscountStrategy strategy = DiscountFactory.getStrategy(order.customerType);
        order.finalPrice = strategy.applyDiscount(order.totalAmount);
        System.out.println("[Strategy] Final price calculated: $" + order.finalPrice);

        // 3. Observer Pattern Execution
        orderSubject.notifyListeners(order);
    }
}

