package Day_5.ecommercestate;

public interface OrderState {
    void next(OrderContext orderContext);
    void cancel(OrderContext orderContext);
}
