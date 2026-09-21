package Day_5.ecommercestate;

public class OrderContext {
    private OrderState orderState;

    public OrderContext(){
        this.orderState=new OrderPlacedState();
    }
    public void setOrderState(OrderState orderState){
        this.orderState=orderState;
    }
    public void proceedToNext(){
        orderState.next(this);
    }
    public void cancelOrder(){
        orderState.cancel(this);
    }
}
