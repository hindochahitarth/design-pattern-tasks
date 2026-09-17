package Day_3.Task;

public abstract class ShippingDecorator implements ShippingService{
    protected final ShippingService wrappedService;

    protected ShippingDecorator(ShippingService wrappedService) {
        this.wrappedService = wrappedService;
    }

    public void shipItem(String itemId,String destination){
        wrappedService.shipItem(itemId,destination);
    }
}
